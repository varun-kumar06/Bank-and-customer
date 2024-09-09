package com.sample.BankCustomerDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.sample.BankCustomerEntity;
import com.sample.BankCustomerRepository.BankCustomerRepository;

@Repository
public class BankCustomerDao {
	
	@Autowired
	BankCustomerRepository br;
	
	
public String postAllCustomer(List<BankCustomerEntity> be)  {
		
		 br.saveAll(be);
		 return "PostedBankCus";
		 
		 
	}


}


