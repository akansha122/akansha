package com.zensar.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:26
 * @modification_date 5/10/2019 7:26
 * @version 1.0
 * @copyright Zensar Technologies.All rights are reserved.
 * @description It is a Payment Entity Class which is in Persistence layer.
 * 
 *
 */

@Entity
@Component
public class Payment {
	public Hotel getHotelBooking() {
		return hotelBooking;
	}

	public void setHotelBooking(Hotel hotelBooking) {
		this.hotelBooking = hotelBooking;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@Column(nullable = false)
	private String cardNo;
	private String cardHolderName;
	private String cardType;
	private int cardExpiryMonth;
	private int cardExpiryYear;

	private LocalDate paymentDate;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "hotelBookingId")
	private Hotel hotelBooking;

	public int getPaymentId() {
		return paymentId;
	}

	public double getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(double roomCharge) {
		this.roomCharge = roomCharge;
	}

	public double getMiscCharge() {
		return miscCharge;
	}

	public void setMiscCharge(double miscCharge) {
		this.miscCharge = miscCharge;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCardExpiryMonth() {
		return cardExpiryMonth;
	}

	public void setCardExpiryMonth(int cardExpiryMonth) {
		this.cardExpiryMonth = cardExpiryMonth;
	}

	public int getCardExpiryYear() {
		return cardExpiryYear;
	}

	public void setCardExpiryYear(int cardExpiryYear) {
		this.cardExpiryYear = cardExpiryYear;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

}