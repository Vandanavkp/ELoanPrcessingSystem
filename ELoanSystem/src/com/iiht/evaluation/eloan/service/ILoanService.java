package com.iiht.evaluation.eloan.service;

import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.LoanInfo;


public interface ILoanService {

	LoanInfo createLoan(LoanInfo loan)throws ELoanSystemException;

}
