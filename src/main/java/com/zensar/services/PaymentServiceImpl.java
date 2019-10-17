package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.PaymentDao;
import com.zensar.dao.PaymentDaoImpl;
import com.zensar.entities.Payment;
/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:26
 * @modification_date 5/10/2019 7:26
 * @version 1.0
 * @copyright All rights are  for Zensar Technologies.
 * @description It is a Payment Service Implementation Class.
 * 
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;

	public PaymentServiceImpl() {
		// TODO Auto-generated constructor stub
		paymentDao = new PaymentDaoImpl();
	}

	public List<Payment> findAllPayments() {
		// TODO Auto-generated method stub
		return paymentDao.getAll();
	}

	public Payment findPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		return paymentDao.getByPaymentId(paymentId);
	}

	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.insert(payment);

	}

	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.update(payment);

	}

	public void removePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.delete(payment);

	}

	public List<Payment> findPaymentByName(String name) {
		// TODO Auto-generated method stub
		List<Payment> list = paymentDao.getAll();
		List<Payment> filterByName = new ArrayList<Payment>();
		for (Payment payment : list) {
		//	if (name != customerName)
			//	filterByName.add(payment);

			//else
				System.out.println("Invalid Entry");
		}

		return filterByName;
	}

	public Long getPaymentCount() {
		// TODO Auto-generated method stub
		long count = 0;
		List<Payment> list1 = paymentDao.getAll();
		for (Payment payment : list1) {
			count++;
		}

		return count;

	}

}
