package com.zensar.services;

import java.util.List;

import com.zensar.entities.Payment;
/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:50
 * @modification_date 5/10/2019 7:50
 * @version 1.0
 * @copyright All rights are  for Zensar Technologies.
 * @description It is a Payment Service Class.
 * 
 *
 */
public interface PaymentService {

	List<Payment> findAllPayments();

	Payment findPaymentById(int paymentId);

	void addPayment(Payment payment);

	void updatePayment(Payment payment);

	void removePayment(Payment payment);

	List<Payment> findPaymentByName(String name);

	Long getPaymentCount();

}
