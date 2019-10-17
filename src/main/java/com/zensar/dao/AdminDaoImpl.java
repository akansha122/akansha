package com.zensar.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Admin;
@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insert(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		hibernateTemplate.save(admin);

	}

	@Override
	public void update(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		hibernateTemplate.update(admin);

	}

	@Override
	public void delete(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(admin);

	}

	@Override
	public Admin getbyUsername(String adminName) throws SQLException {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Admin.class, adminName);
	}

	@Override
	public List<Admin> getAll() throws SQLException {
		// TODO Auto-generated method stub

		return (List<Admin>) hibernateTemplate.find("FROM Admin");

	}

}