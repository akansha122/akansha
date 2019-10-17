package com.zensar.services;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.RoomDao;
import com.zensar.dao.RoomDaoImpl;
import com.zensar.entities.Customer;
import com.zensar.entities.Hotel;
import com.zensar.entities.HotelBooking;
import com.zensar.entities.Room;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDao roomDao;

	public RoomServiceImpl() {
		// TODO Auto-generated constructor stub
		roomDao = new RoomDaoImpl();
	}

	public void setUserDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	public void addRoom(Room room) throws SQLException {
		// TODO Auto-generated method stub
		roomDao.insert(room);
	}

	public void updateRoom(Room room) throws SQLException {
		// TODO Auto-generated method stub
		roomDao.update(room);
	}

	public void removeRoom(Room room) throws SQLException {
		// TODO Auto-generated method stub
		roomDao.delete(room);
	}

	public Room findRoomById(int roomId) throws SQLException {
		return roomDao.getbyRoomID(roomId);
	}

	public List<Room> findAllRooms() throws SQLException {
		// TODO Auto-generated method stub
		return roomDao.getAll();
	}

	@Override
	public boolean isEmpty(Room room) {
		if (room != null) {
			
			return true;
		} else {
			return false;
		}
	}

	/*
	 * @Override public void bookRoom() { new HotelBooking();
	 * Calendar.getInstance();
	 * 
	 * }
	 */
}
