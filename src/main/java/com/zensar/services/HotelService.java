package com.zensar.services;

import java.sql.SQLException;
import java.util.List;

import com.zensar.entities.Hotel;
import com.zensar.entities.Room;

public interface HotelService {
	
	List<Hotel> findAllHotels();

	Hotel findHotelById(int hotelId);

	void addHotel(Hotel hotel);

	void removeHotel(Hotel hotel);

	void updateHotel(Hotel hotel);

	List<Hotel> getHotelByLocation(String location);
	
	List<Hotel> getHotelByName(String hotelName);
	
	List<Room> getRoomByPrice(int min, int max) throws SQLException;
	
	//List<Room> getRoomByDate(LocalDate min, LocalDate max);

}
