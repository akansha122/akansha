package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Payment;

import com.zensar.services.PaymentService;

/**
 * @author Susmita Basak
 * @creation_date 12th Oct 2019 15.44pm
 * @modification_date 12th Oct 2019 5.44pm
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Payment Class to access payment entities.
 */
@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/payments")
	public List<Payment> getAllProducts() {
		return paymentService.findAllPayments();

	}

	@GetMapping("/payments/{id}")

	public Payment getPayment(@PathVariable("id") int paymentId) {
		return paymentService.findPaymentById(paymentId);

	}

	@PostMapping("/products/add")

	public String add(@RequestBody Payment payment) {
		paymentService.addPayment(payment);
		return "new payment is added" + payment.getPaymentId() + "is added successfully";

	}

	@PutMapping("/payment/update")
	public String update(@RequestBody Payment payment) {

		if (paymentService.findPaymentById(payment.getPaymentId()) != null) {
			paymentService.updatePayment(payment);
			return "payment" + payment.getPaymentId() + "is update successfully";
		} else {
			return "sorry!!product not found";

		}
	}

	@DeleteMapping("/payment/delete")
	public String remove(@RequestBody Payment payment) {
		if (paymentService.findPaymentById(payment.getPaymentId()) != null) {
			paymentService.removePayment(payment);
			return "payment" + payment.getPaymentId() + "is deleted successfully";
		} else {
			return "sorry!!product not found";

		}

	}

	@GetMapping("/payment/{name}")
	public List<Payment> getPaymentByName(@PathVariable("name") String name) {
		return paymentService.findPaymentByName(name);

	}
	/*
	 * @PostMapping("/payment/confirm") public String getConfirmPayment(@RequestBody
	 * Payment payment) { if(paymentService.confirmPayment(payment)!=null) {
	 * paymentService.confirmPayment(payment); return
	 * "Dear"+payment.getCardHolderName()+"you payment is confirmed successfully"; }
	 * else return "sorry!!your payment cannot be confirmed";
	 * 
	 * }
	 * 
	 * @PostMapping public Payment getCancelPayment(@RequestBody Payment payment) {
	 * return null; }
	 * 
	 * 
	 * public String getCheckPayment(@RequestBody Payment payment) {
	 * if(paymentService.checkPayment(payment)!=payment.getTotalCharge()) {
	 * paymentService.confirmPayment(payment); return
	 * "Dear"+payment.getCardHolderName()+"you payment is confirmed successfully"; }
	 * return null; }
	 * 
	 */
}
