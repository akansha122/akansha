package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Payment;

/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:26
 * @modification_date 5/10/2019 7:26
 * @version 1.0
 * @copyright Zensar Technologies.All rights are reserved.
 * @description It is a Payment Dao Implementation Class.
 *
 *
 */
@Repository
public class PaymentDaoImpl implements PaymentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return (List<Payment>) hibernateTemplate.find("from Payment");

	}

	public Payment getByPaymentId(int paymentId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Payment.class, paymentId);
	}

	public void insert(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(payment);
	}

	public void update(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(payment);

	}

	public void delete(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(payment);

	}

}
