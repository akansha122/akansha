package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Customer;
import com.zensar.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllProducts() {
		return customerService.findAllCustomer();
	}

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable("id") int customerId) {
		return customerService.findCustomerById(customerId);
	}

	@PostMapping("/customers/add")
	public String add(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "new Customer" + customer.getCustomerId() + "is added succesfully";
	}

}
