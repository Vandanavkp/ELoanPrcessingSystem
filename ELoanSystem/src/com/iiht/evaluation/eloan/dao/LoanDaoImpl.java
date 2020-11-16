package com.iiht.evaluation.eloan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;


public class LoanDaoImpl implements ILoanDao{

	
	private static String ADD_USER_QRY=
			"INSERT INTO loaninfo VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	
	Logger log = Logger.getLogger("loanDao");
	@Override
	public LoanInfo addLoan(LoanInfo loan) throws ELoanSystemException {
		try(Connection con = ConnectionDao.getConn();
				PreparedStatement pst = con.prepareStatement(ADD_USER_QRY)){
		
			pst.setString(1, "100");
			pst.setString(2, loan.getPurpose());
			pst.setInt(3, loan.getAmtrequest());
			pst.setString(4, loan.getDoa());
			pst.setString(5, loan.getBstructure());
			pst.setString(6, loan.getBindicator());
			pst.setString(7, loan.getTindicator());
			pst.setString(8, loan.getAddress());
			pst.setString(9, loan.getEmail());
			pst.setString(10, loan.getMobile());
			pst.setString(11, loan.getStatus());
			pst.setString(12, loan.getUserName());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			log.error(e);
			throw new ELoanSystemException("Unable to create Loan Application,verify your details!");
		}
		return loan;
	}

	
}
