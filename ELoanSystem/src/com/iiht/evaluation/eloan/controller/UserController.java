package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iiht.evaluation.eloan.dao.ConnectionDao;
import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.ApprovedLoan;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;
import com.iiht.evaluation.eloan.service.ILoanService;
import com.iiht.evaluation.eloan.service.IUserService;
import com.iiht.evaluation.eloan.service.LoanServiceImpl;
import com.iiht.evaluation.eloan.service.UserServiceImpl;
import com.mysql.cj.xdevapi.Statement;

@WebServlet({"/user","/validate","/registernewuser","/placeloan","/application1","/editLoanProcess","/registerUser"
		,"/register","/application","/trackloan","/editloan","/displaystatus"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Inprocess = null;
	private ConnectionDao connDao;
	private IUserService userService;
	private ILoanService loanService;
	public void setConnDao(ConnectionDao connDao) {
		this.connDao = connDao;
	}
	
	@Override
	public void init() throws ServletException {
		this.userService = new UserServiceImpl();
		this.loanService =(ILoanService) new LoanServiceImpl();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		
		String viewName = "";
		try {
			switch (action) {
			case "/registernewuser":
				viewName=registernewuser(request,response);
				break;
			case "/validate":
				viewName=validate(request,response);
				break;
			case "/placeloan":
				viewName=placeloan(request,response);
				break;
			case "/application1":
				viewName=application(request,response);
				break;
			case "/editLoanProcess"  :
				viewName=editLoanProcess(request,response);
				break;
			case "/registeruser":
				viewName=registerUser(request,response);
				break;
			case "/register":
				viewName = register(request, response);
				break;
			case "/application":
				viewName = application(request, response);
				break;
			case "/trackloan":
				viewName = trackloan(request, response);
				break;
			case "/editloan":
				viewName = editloan(request, response);
				break;	
			case  "/displaystatus" :
				viewName=displaystatus(request,response);
				break;
			default : viewName = "notfound.jsp"; break;	
			}
		} catch (Exception ex) {
			
			throw new ServletException(ex.getMessage());
		}
			RequestDispatcher dispatch = 
					request.getRequestDispatcher(viewName);
			dispatch.forward(request, response);
	}
	private String validate(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		/* write the code to validate the user */
		HttpSession session = request.getSession();
		String userName1 = request.getParameter("unm");
		String password1 = request.getParameter("pwd");
		String view = "";
		if (userName1 == null || userName1.isEmpty() || password1 == null || password1.isEmpty()) {
			request.setAttribute("err", "Username or Password is empty!");
			view = "index.jsp";
			
		} else {
			try {
				User user = userService.authenticateUser(userName1, password1);
				if(user != null) {
					session.setAttribute("user", user);
					if(user.getRole().equals("ADMIN")) {
						view = "adminhome1.jsp";
					}
					else {
						view = "userhome1.jsp";
					}
				} else {
					request.setAttribute("err", "Login ID or Password is not valid!");
					view = "index.jsp";
				}
			} catch (ELoanSystemException e) {
				request.setAttribute("err", e.getMessage());
				view = "index.jsp";
			}
		}
		return view;
	}
			

	private String placeloan(HttpServletRequest request, HttpServletResponse response) throws ELoanSystemException {
		// TODO Auto-generated method stub
	/* write the code to place the loan information */
		return null;
	}
	private String editLoanProcess(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to edit the loan info */
		
		return null;
	}
	private String registerUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		return "newuserui.jsp";
	}
	private String registernewuser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String userName = request.getParameter("unm");
		String password = request.getParameter("pwd");
		String view = "";
		if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
			request.setAttribute(" err", "Username or Password is Empty!");
			view = "register.jsp";
			
			
		} else {
			User newUser = new User(userName, password, "USER");
			try {
				userService.createUser(newUser);
				request.setAttribute("err", "User ID created successfully!Please login");
				view = "index.jsp";						
				}
				catch (ELoanSystemException e) {
				request.setAttribute("err", e.getMessage());
				view="errorPage.jsp";
			}
		}
		return view;
	}
	
	private String register(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write the code to redirect to register page */
		
		return "newuserui.jsp";
	}
	private String displaystatus(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code the display the loan status based on the given application
		   number 
		*/
		
		return null;
	}

	private String editloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write a code to return to editloan page */
		return null;
	}

	private String trackloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write a code to return to trackloan page */
		
		return null;
	}

	private String application(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write a code to return to trackloan page */
		return null;
	}
}