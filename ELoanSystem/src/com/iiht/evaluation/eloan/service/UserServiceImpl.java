package com.iiht.evaluation.eloan.service;

import com.iiht.evaluation.eloan.dao.IUserDao;
import com.iiht.evaluation.eloan.dao.UserDaoImpl;
import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.User;

public class UserServiceImpl implements IUserService{

	private IUserDao userDao;
	public UserServiceImpl() {
		this.userDao=new UserDaoImpl();
	}
	@Override
	public User authenticateUser(String userName, String password) throws ELoanSystemException {
		User user = userDao.getUser(userName);
		if(user==null || !password.equals(user.getPassword())) {
			throw new ELoanSystemException("Invalid User Credits");
		}
		return user;
	}
	
	@Override
	public User createUser(User user) throws ELoanSystemException {
		if(user!=null) {
			userDao.addUser(user);
		}
		return user;
	}

}
