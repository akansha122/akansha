package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Hotel;

public interface HotelDao {

	List<Hotel> getAll();

	Hotel getById(int id);

	void insert(Hotel hotel);

	void update(Hotel hotel);

	void delete(Hotel hotel);

}
