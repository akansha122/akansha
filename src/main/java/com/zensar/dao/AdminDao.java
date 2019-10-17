package com.zensar.dao;

import java.sql.SQLException;
import java.util.List;

import com.zensar.entities.Admin;


/**
 * @author Sudhanya Mukhopadhyay
 * @Creation_date 4th Oct 7.01PM
 * @Modification_date 4th Oct 7.01PM
 * @Version 1.0
 * @copyright Admin Dao. All rights reserved
 * @description This is Admin Dao class.
 * 				
 */

public interface AdminDao {
	
	void insert (Admin admin) throws SQLException;
	void update (Admin admin)  throws SQLException;
	void delete (Admin admin)  throws SQLException;
	Admin getbyUsername(String adminName)  throws SQLException;
	List<Admin> getAll()  throws SQLException;
}
