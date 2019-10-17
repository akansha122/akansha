package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.dao.CustomerDao;
import com.zensar.dao.CustomerDaoImpl;
import com.zensar.entities.Customer;
import com.zensar.entities.Hotel;
import com.zensar.entities.HotelBooking;
import com.zensar.entities.Room;

/**
 * @author Akansha Shah
 * @Creation_date 5th Oct 2019 10.23AM
 * @Modification_date 17th Oct 2019 1.00PM
 * @version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is service class used in business layer.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}

	public void addCustomer(Customer customer) {
		customerDao.insert(customer);
	}

	public void updateCustomer(Customer customer) {
		customerDao.update(customer);

	}

	public void removeCustomer(Customer customer) {
		customerDao.delete(customer);
	}

	public List<Customer> findAllCustomer() {
		return customerDao.getAll();
	}

	public Customer findCustomerById(int customerId) {
		return customerDao.getById(customerId);
	}

	public List<Customer> getCustomerByEmail(String emailId) {
		List<Customer> list1 = customerDao.getAll();
		List<Customer> list2 = new ArrayList();
		for (Customer customer : list1) {
			if (customer.getEmailId().equalsIgnoreCase(emailId))
				list2.add(customer);
		}
		return list2;
	}

	public List<Customer> getCustomerByName(String customerName) {
		List<Customer> list1 = customerDao.getAll();
		List<Customer> list2 = new ArrayList();
		for (Customer customer : list1) {
			if (customer.getCustomerName().equalsIgnoreCase(customerName))
				list2.add(customer);
		}
		return list2;
	}

	public long customerCount() {
		return findAllCustomer().size();
	}

	@Override
	public List<HotelBooking> getBookingDetail(HotelBooking hotelBooking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIfUserExists(String emailId) {
		Customer customer = customerDao.getUserByEmail(emailId);
		if (customer != null)
			return false;
		else
			return true;
	}

	@Override
	public boolean checkLogin(String emailId, String password) {
		Customer customer = customerDao.getUserByEmail(emailId);
		if (customer != null) {
			String pwd = customer.getPassword();
			if (pwd.equals(password))
				return true;
			else
				return false;

		} else
			return false;
	}

	@Override
	public boolean resetPassword(String emailId, String newPassword) {
		Customer customer=customerDao.getUserByEmail(emailId);
		if(customer!=null)
		{
		   customer.setPassword(newPassword);
		   customerDao.update(customer);
		}
		return false;
	}

	// @Override
	/*
	 * public List<HotelBooking> getBookingDetail(HotelBooking hotelBooking) {
	 * 
	 * for(HotelBooking hb:hotelBooking) {
	 * 
	 * } return null; }
	 */
}
