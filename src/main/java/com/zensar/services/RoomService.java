package com.zensar.services;

import java.sql.SQLException;
import java.util.List;
import com.zensar.entities.Room;

public interface RoomService {
	
	void addRoom(Room room) throws SQLException;
	void updateRoom(Room room) throws SQLException;
	void removeRoom(Room room) throws SQLException;
	List<Room> findAllRooms() throws SQLException; 
	Room findRoomById(int roomId) throws SQLException;		
//findRoomByPrice
	boolean isEmpty(Room room);
	
}
