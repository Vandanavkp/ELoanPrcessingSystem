package com.iiht.evaluation.eloan.dao;

import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.LoanInfo;


public interface ILoanDao {
	LoanInfo addLoan(LoanInfo user) throws ELoanSystemException;
}

