package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Customer;
/**
 * @author Akansha Shah
 * @Creation_date 5th Oct 2019 10.23AM
 * @Modification_date 5th Oct 2019 10.23AM
 * @version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is an dao class used in persistent layer.
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insert(Customer customer) {
		hibernateTemplate.save(customer);
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(customer);
	}

	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(customer);
	}

	public Customer getById(int customerId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Customer.class, customerId);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) hibernateTemplate.find("find Product");
	}

	@Override
	public Customer getUserByEmail(String emailId) {
		return hibernateTemplate.get(Customer.class, emailId);
	}

	
}
