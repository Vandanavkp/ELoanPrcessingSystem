package com.iiht.evaluation.eloan.service;

import com.iiht.evaluation.eloan.dao.ILoanDao;
import com.iiht.evaluation.eloan.dao.LoanDaoImpl;
import com.iiht.evaluation.eloan.exception.ELoanSystemException;
import com.iiht.evaluation.eloan.model.LoanInfo;

public class LoanServiceImpl implements ILoanService {
private ILoanDao loanDao;
public LoanServiceImpl() {
	this.loanDao=new LoanDaoImpl();
}

	@Override
	public LoanInfo createLoan(LoanInfo loan) throws ELoanSystemException {
		if(loan!=null) {
			loanDao.addLoan(loan);
		}
		return loan;
	}
}


