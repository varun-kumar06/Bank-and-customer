package com.sample.BankCustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sample.BankCustomerEntity;

import com.sample.BankCustomerDao.BankCustomerDao;

@Service
public class BankCustomerService {
	
	@Autowired
	BankCustomerDao bd;
	
	
public String postAllCustomer(List<BankCustomerEntity> be)  {
		
	
	return bd.postAllCustomer(be);
	}

}
