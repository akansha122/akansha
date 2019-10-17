package com.zensar.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Room;

@Repository
public class RoomDaoImpl implements RoomDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(Room room) throws SQLException {
		// TODO Auto-generated method stub
		hibernateTemplate.save(room);

	}

	public void update(Room room) throws SQLException {
		// TODO Auto-generated method stub
		hibernateTemplate.update(room);

	}

	public void delete(Room room) throws SQLException {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(room);
	}

	public Room getbyRoomID(int roomId) throws SQLException {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Room.class, roomId);
	}

	public List<Room> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return (List<Room>) hibernateTemplate.find("from Room");
	}
}