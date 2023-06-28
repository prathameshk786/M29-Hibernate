package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {

	void createEmployee(Employee emp); //create
	Employee retrieveEmployee(int id); //retrieve
	void mergeEmployee(Employee emp); //update
	void removeEmployee(Employee emp); //delete
}
