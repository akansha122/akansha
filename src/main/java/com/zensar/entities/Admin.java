package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Admin {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String adminId;
	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	private String adminName;
	private String password;
	/*
	 * @OneToMany(mappedBy = "admin") List<Customer> customer;
	 */

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin(String adminName, String password) {
		this.adminName = adminName;
		this.password = password;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

}
