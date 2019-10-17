package com.zensar.dao;

import java.util.List;

import com.zensar.entities.HotelBooking;

public interface HotelBookingDao {
	List<HotelBooking> getAllBookings();
	void insert(HotelBooking hb);
	void update(HotelBooking hb);
	void delete(HotelBooking hb);
	HotelBooking getById(int bookId) ;

}
