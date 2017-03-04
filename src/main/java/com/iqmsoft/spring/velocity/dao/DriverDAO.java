package com.iqmsoft.spring.velocity.dao;

import java.util.List;

import com.iqmsoft.spring.velocity.model.Driver;

public interface DriverDAO {

	public void addDriver(Driver d);
	public void updateDriver(Driver d);
	public List<Driver> listDrivers();
	public Driver getDriverById(int id);
	public void removeDriver(int id);
	public List<Driver> listDriversByTeamName(String teamName);
} 