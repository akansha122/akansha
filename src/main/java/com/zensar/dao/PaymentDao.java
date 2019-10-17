package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Payment;
/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:40
 * @modification_date 5/10/2019 7:40
 * @version 1.0
 * @copyright All rights are  for Zensar Technologies.
 * @description It is a Payment Dao Class.
 * 
 *
 */
public interface PaymentDao {
	List<Payment> getAll();
	Payment getByPaymentId(int paymentId);
	void insert(Payment payment);
	void update(Payment payment);
	void delete(Payment payment);
}
