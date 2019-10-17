package com.zensar.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.HotelBookingDao;
import com.zensar.dao.HotelBookingDaoImpl;
import com.zensar.entities.HotelBooking;

@Service
public class HotelBookingServiceImpl implements HotelBookingService {
	@Autowired
	private HotelBookingDao hotelbookingDao;

	public HotelBookingServiceImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		hotelbookingDao = new HotelBookingDaoImpl();
	}

	public void add(HotelBooking hb) {
		// TODO Auto-generated method stub
		hotelbookingDao.insert(hb);

	}

	public void update(HotelBooking hb) {
		// TODO Auto-generated method stub
		hotelbookingDao.update(hb);

	}

	public void remove(HotelBooking hb) {
		// TODO Auto-generated method stub
		hotelbookingDao.delete(hb);

	}

	public List<HotelBooking> getAllBooking() {
		// TODO Auto-generated method stub

		return hotelbookingDao.getAllBookings();
	}

	public HotelBooking getById(int bookId) {
		// TODO Auto-generated method stub
		return hotelbookingDao.getById(bookId);
	}

}
