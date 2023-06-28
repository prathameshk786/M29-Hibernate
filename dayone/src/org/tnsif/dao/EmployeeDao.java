package org.tnsif.dao;

import org.tnsif.entities.Employee;

public interface EmployeeDao {

	//by default abstract
	void addEmployee(Employee emp); //create
	Employee getEmployee(int id); //retrieve
	void updateEmployee(Employee emp); //update
	void deleteEmployee(Employee emp); //delete
	
	//JPA transaction
	void beginTransaction();
	void commitTransaction();
	
	
	
}
