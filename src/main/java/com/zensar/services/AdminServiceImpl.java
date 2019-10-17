package com.zensar.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.dao.AdminDao;
import com.zensar.dao.AdminDaoImpl;
import com.zensar.entities.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	public AdminServiceImpl() {
		// TODO Auto-generated constructor stub
		adminDao = new AdminDaoImpl();
	}

	public void addAdmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		adminDao.insert(admin);
	}

	public void updateAdmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		adminDao.update(admin);
	}

	public void removeAdmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		adminDao.delete(admin);
	}

	public List<Admin> findAllAdmin() throws SQLException {
		// TODO Auto-generated method stub
		return adminDao.getAll();
	}

	/*
	 * public boolean validateAdmin(Admin admin) { // TODO Auto-generated method
	 * stub return false; }
	 */

}
