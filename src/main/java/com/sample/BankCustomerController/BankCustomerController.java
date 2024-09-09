package com.sample.BankCustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sample.BankCustomerEntity;
import com.sample.BankCustomerService.BankCustomerService;


@RestController
@RequestMapping(value="/bankCustomer")
public class BankCustomerController {
	
	@Autowired
	BankCustomerService bs;
	
	@Autowired 
	RestTemplate rt;
	
	@PostMapping(value="/postAllCustomer")
	public String postAllCustomer(@RequestBody List<BankCustomerEntity> be)  {
		
		String url1 = "http://localhost:8084/bank/getBankbyIfc/";
	                   
		be.forEach(x->{
			String h=x.getIfcCode();
			
			ResponseEntity<String>re1=rt.exchange(url1+h, HttpMethod.GET,null, String.class);
			String p= re1.getBody();
			
			x.setBranch(p); 
			
		});
		return bs.postAllCustomer(be);
	}
	
	
}
