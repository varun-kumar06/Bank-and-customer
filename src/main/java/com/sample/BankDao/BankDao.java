package com.sample.BankDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.sample.BankEntity.BankEntity;

@Repository
public class BankDao {
	
	@Autowired
	BankRepository br;
	public String postAllBankdetails(List<BankEntity> be){
		br.saveAll(be);
		return "PostedBank";
	}
	
	public String getbyBankIfc ( String a ){
		return br.getbyBankIfc(a);
	}

}
