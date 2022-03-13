package com.lendingpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendingpoint.Model.CustomerFileDetails;
import com.lendingpoint.services.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@PostMapping("/save")
	private String saveProductList(@RequestBody CustomerFileDetails customerEntity) {
		return customerServiceImpl.saveCustomer(customerEntity);

	}
}
