package com.zensar.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.HotelDao;
import com.zensar.dao.HotelDaoImpl;
import com.zensar.dao.RoomDao;
import com.zensar.entities.Hotel;
import com.zensar.entities.Room;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelDao hotelDao;
	@Autowired
	private RoomDao roomDao;

	public HotelServiceImpl() {
		hotelDao = new HotelDaoImpl();
	}

	public List<Hotel> findAllHotels() {
		return hotelDao.getAll();
	}

	public Hotel findHotelById(int hotelId) {
		return hotelDao.getById(hotelId);

	}

	public void addHotel(Hotel hotel) {
		hotelDao.insert(hotel);

	}

	public void removeHotel(Hotel hotel) {

		hotelDao.delete(hotel);

	}

	public void updateHotel(Hotel hotel) {

		hotelDao.update(hotel);

	}

	public List<Hotel> getHotelByLocation(String location) {
		// TODO Auto-generated method stub
		List<Hotel> list1 = hotelDao.getAll();
		List<Hotel> list2 = new ArrayList();
		for (Hotel h : list1) {
			if (h.getLocation().equalsIgnoreCase(location)) {
				list2.add(h);
			}
		}
		return list2;
	}

	public List<Hotel> getHotelByName(String hotelName) {
		List<Hotel> list1 = hotelDao.getAll();
		List<Hotel> list2 = new ArrayList();

		for (Hotel h1 : list1) {
			if (h1.getHotelName().equalsIgnoreCase(hotelName)) {
				list2.add(h1);
			}
		}
		return list2;

	}

	@Override
	public List<Room> getRoomByPrice(int min, int max) throws SQLException {
		List<Room> room = roomDao.getAll();
		List<Room> list2 = new ArrayList<>();
		for (Room list : room) {
			if (list.getRate() > min && list.getRate() < max) {
				list2.add(list);
			}
		}
		return list2;
	}

	/*
	 * @Override public List<Room> getRoomByDate(LocalDate min, LocalDate max) {
	 * List<Room> room = roomDao.getAll(); List<Room> list2 = new ArrayList<>();
	 * return null; }
	 */
}
