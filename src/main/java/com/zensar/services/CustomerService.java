package com.zensar.services;

import java.util.List;

import com.zensar.entities.Customer;
import com.zensar.entities.Hotel;
import com.zensar.entities.HotelBooking;
import com.zensar.entities.Room;
/**
 * @author Akansha Shah
 * @Creation_date 6th Oct 2019 07.05PM
 * @Modification_date 6th Oct 2019 07.05PM
 * @version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is an service interface used in business layer.
 */

public interface CustomerService {

    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void removeCustomer(Customer customer);
    Customer findCustomerById(int customerId);
    List<Customer> findAllCustomer();
    List<Customer> getCustomerByEmail(String emailId);
    List<Customer> getCustomerByName(String customerName);
    long customerCount();
    boolean checkIfUserExists(String emailId);
    List<HotelBooking> getBookingDetail(HotelBooking hotelBooking);
    public boolean checkLogin(String emailId,String password); 
    public boolean resetPassword(String emailId,String newPassword);
	 
}
