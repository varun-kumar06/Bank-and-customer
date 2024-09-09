package com.sample.BankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.BankEntity.BankEntity;
import com.sample.BankService.BankService;

@RestController
@RequestMapping(value="/bank")
public class BackController {
	
	@Autowired
	BankService bs;
	@PostMapping(value="/postAllBankdetails")
	public String postAllBankdetails(@RequestBody List<BankEntity> be){
		return bs.postAllBankdetails(be);
	}
	
	@GetMapping(value="/getBankbyIfc/{a}")
	public String getbyBankIfc(@PathVariable String a ){
		return bs.getbyBankIfc(a);
	}
	

}
