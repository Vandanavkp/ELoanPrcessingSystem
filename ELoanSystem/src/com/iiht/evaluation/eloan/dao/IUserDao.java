package com.iiht.evaluation.eloan.dao;

import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.User;

public interface IUserDao {
	User getUser(String userName) throws ELoanSystemException;
	User addUser(User user) throws ELoanSystemException;
}
