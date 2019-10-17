package com.zensar.dao;

import java.sql.SQLException;
import java.util.List;

import com.zensar.entities.Room;

public interface RoomDao {
	
	void insert(Room room)throws SQLException;
	void update(Room room)throws SQLException;
	void delete(Room room)throws SQLException;
	Room getbyRoomID(int roomId)throws SQLException;
	List<Room> getAll()throws SQLException;

}
