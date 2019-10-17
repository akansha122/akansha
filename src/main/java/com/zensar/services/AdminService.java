package com.zensar.services;

import java.sql.SQLException;
import java.util.List;

import com.zensar.entities.Admin;

/**
 * @author Dipankar Chakraborty
 * @version 1.0
 * @creation_date 5th Oct 2019 4.34 PM
 * @modification_date 5th Oct 2019 4.34PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description:It is business service interface. It is used in business layer of application.
 */
public interface AdminService {

	void addAdmin(Admin admin) throws SQLException;
	void updateAdmin(Admin admin) throws SQLException;
	void removeAdmin(Admin admin) throws SQLException;
	List<Admin> findAllAdmin() throws SQLException;
	//boolean validateAdmin(Admin admin);
}
