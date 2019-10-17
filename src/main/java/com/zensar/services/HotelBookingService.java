package com.zensar.services;

import java.util.Date;
import java.util.List;

import com.zensar.entities.HotelBooking;

public interface HotelBookingService {
	void add(HotelBooking hb);

	void update(HotelBooking hb);

	void remove(HotelBooking hb);

	List<HotelBooking> getAllBooking();

	HotelBooking getById(int bookId);

}
