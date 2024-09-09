package com.sample.BankService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sample.BankDao.BankDao;
import com.sample.BankEntity.BankEntity;

@Service
public class BankService {

	@Autowired
	BankDao bd;
	public String postAllBankdetails(List<BankEntity> be){
		return bd.postAllBankdetails(be);
	}
	
	public String getbyBankIfc( String a ){
		return bd.getbyBankIfc(a);
	}
}
