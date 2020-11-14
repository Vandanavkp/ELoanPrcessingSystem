package com.iiht.evaluation.eloan.service;

import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.User;


public interface IUserService {
	User authenticateUser(String userName,String password) throws ELoanSystemException;
	User createUser(User user)throws ELoanSystemException;
}
