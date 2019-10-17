package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.entities.HotelBooking;

@Repository
@Transactional
public class HotelBookingDaoImpl implements HotelBookingDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<HotelBooking> getAllBookings() {
		// TODO Auto-generated method stub
		return (List<HotelBooking>) hibernateTemplate.find("find HotelBooking");
	}

	public void insert(HotelBooking hb) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(hb);

	}

	public void update(HotelBooking hb) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(hb);

	}

	public void delete(HotelBooking hb) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(hb);

	}

	public HotelBooking getById(int bookId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(HotelBooking.class, bookId);
	}

}
