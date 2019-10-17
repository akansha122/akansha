package com.zensar.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Room;
import com.zensar.services.RoomService;

@RestController
public class RoomController {
	@Autowired
	private RoomService roomService;
	@GetMapping("/rooms")
	public List<Room> getAllRooms() throws SQLException{ 
		
		return roomService.findAllRooms(); 
		
	}
	@GetMapping("/rooms/{id}")
	public Room getRoom(@PathVariable("id")int roomId) throws SQLException
	{
		return roomService.findRoomById(roomId);   
		
	}
	@PostMapping("rooms/add")
	public String addRoom(@PathVariable("id")Room roomId) throws SQLException
	{
		roomService.addRoom(roomId);
		return "new room is added" +roomId.getRoomId();  
	}
	@PostMapping("/rooms/add1")
	public String addRoom(@RequestParam("id")int roomId,@RequestParam("type")String name) throws SQLException {
		Room roomInfo=new Room(); 
		roomService.addRoom(roomInfo);
		return "new room is added successfully";  
	}
	
	@PutMapping("rooms/update")
	public String update(@RequestBody Room roomInfo) throws SQLException  
	{
		if(roomService.findRoomById(roomInfo.getRoomId())!=null)
				{
			roomService.updateRoom(roomInfo);
		return "room is updated successfully" +roomInfo.getRoomId();   
		
	}
		else {
			return "sorry room is not found"; 
		}
		
}
	@DeleteMapping("room/delete")
	public String delete(@RequestBody Room roomInfo) throws SQLException 
	{
		if(roomService.findRoomById(roomInfo.getRoomId())!=null) 
				{
			roomService.updateRoom(roomInfo);
		return "room is deleted successfully";
		
	}
		else {
			return "sorry room not found"; 
		}	

	}/*
		 * @GetMapping("/rooms/{type}") public Room
		 * getRoomType(@PathVariable("type")String roomType) throws SQLException {
		 * return roomService.getbyRoomType(roomType); }
		 */
}
