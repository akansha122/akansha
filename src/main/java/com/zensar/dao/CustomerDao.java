package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Customer;
/**
 * @author Akansha Shah
 * @Creation_date 5th oct 2019 9.56AM
 * @Modification_date 5th oct 2019 9.56AM
 * @version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is an dao interface used in persistent layer.
 */
public interface CustomerDao {

	void insert(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer getById(int customerId);
	Customer getUserByEmail(String emailId);
	List<Customer> getAll();
}
