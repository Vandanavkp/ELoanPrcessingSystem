package com.iiht.evaluation.eloan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.User;

public class UserDaoImpl implements IUserDao {

	private static String GET_USER_QRY=
			"SELECT * FROM eloanb7_users WHERE username=?";
	private static String ADD_USER_QRY=
			"INSERT INTO eloanb7_users VALUES(?,?,?)";
	
	Logger log = Logger.getLogger("userDao");

	@Override
	public User getUser(String userName) throws ELoanSystemException {
		User user=null;
		try(Connection con = ConnectionDao.getConn();
				PreparedStatement pst = con.prepareStatement(GET_USER_QRY)){
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setRole(rs.getString(3));
			}
		} catch (SQLException e) {
			log.error(e);
			throw new ELoanSystemException("User details could not be fetched");
		}
		return user;
	}

	@Override
	public User addUser(User user) throws ELoanSystemException {
		try(Connection con = ConnectionDao.getConn();
				PreparedStatement pst = con.prepareStatement(ADD_USER_QRY)){
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getRole());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			log.error(e);
			throw new ELoanSystemException("Username already exists,please enter a different username");
		}
		return user;
	}
}
