package com.sample.BankCustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.BankCustomerEntity;

public interface BankCustomerRepository extends JpaRepository<BankCustomerEntity, Integer>{
	

}
