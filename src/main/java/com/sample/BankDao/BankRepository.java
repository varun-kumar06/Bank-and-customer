package com.sample.BankDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.sample.BankEntity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Integer>{

	
	
	
	@Query(value= "select branch from Bank_table where ifc_code =?", nativeQuery= true)
	public String  getbyBankIfc(String a );
	
	

}
