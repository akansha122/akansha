package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Hotel;
@Repository
public class HotelDaoImpl implements HotelDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Hotel> getAll() {
		return (List<Hotel>) hibernateTemplate.find("from Hotel");
	}

	@Override
	public Hotel getById(int hotelId) {
		return hibernateTemplate.get(Hotel.class, hotelId);
	}

	@Override
	public void insert(Hotel hotel) {
		hibernateTemplate.save(hotel);
	}

	@Override
	public void update(Hotel hotel) {

		hibernateTemplate.update(hotel);
	}

	@Override
	public void delete(Hotel hotel) {
		hibernateTemplate.delete(hotel);
	}

}
