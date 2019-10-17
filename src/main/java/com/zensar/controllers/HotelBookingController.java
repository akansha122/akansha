package com.zensar.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.HotelBooking;
import com.zensar.services.HotelBookingService;

@RestController
public class HotelBookingController {
	@Autowired
	private HotelBookingService hotelBookingService;

	@GetMapping("/HotelBooking")
	public List<HotelBooking> getAllBooking() {
		// TODO Auto-generated method stub

		return hotelBookingService.getAllBooking();
	}

	@GetMapping("/HotelBooking{id}")
	public HotelBooking getById(@PathVariable("id") int bookId) {
		// TODO Auto-generated method stub
		return hotelBookingService.getById(bookId);
	}

	/*
	 * @PostMapping("/addHotelBooking") public String add(@RequestParam("bookid")
	 * int bookId, @RequestParam("bookingDate") Date bookingDate,
	 * 
	 * @RequestParam("checkInDate") Date checkInDate, @RequestParam("chechOutDate")
	 * Date checkOutDate,
	 * 
	 * @RequestParam("noOfPerson") int noOfPerson, @RequestParam("beds") int beds) {
	 * hotelBooking hb = new HotelBooking(bookId, bookingDate, checkInDate,
	 * checkOutDate, noOfPerson, beds); return
	 * "new hotelbooking is added successfully";
	 * 
	 * }
	 */

	@PutMapping("/hotelBooking/update")
	public String update(@RequestBody HotelBooking hb) {
		if (hotelBookingService.getById(hb.getBookId()) != null) {
			hotelBookingService.update(hb);
			return "updated";
		} else
			return "sorry booking not found";
	}

	@PutMapping("/hotelBooking/delete")
	public String delete(@RequestBody HotelBooking hb) {
		if (hotelBookingService.getById(hb.getBookId()) != null) {
			hotelBookingService.remove(hb);
			;
			return "HotelBooking deleted";
		} else {
			return "HotelBooking not found";
		}
	}
}