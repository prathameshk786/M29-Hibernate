//Program to demonstrate on CRUD using JPA with hibernate
//Driver class
package org.tnsif.client;

import org.tnsif.entities.Employee; 
import org.tnsif.service.EmployeeServiceImpl;
import org.tnsif.service.EmployeeService;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//create
		emp.setId(102);
		emp.setName("Pratik Kanade");
		service.createEmployee(emp);
		System.out.println("The data added successfully in the database");
		
		//update
		emp=service.retrieveEmployee(101);
		emp.setName("Lalit Barad");
		service.mergeEmployee(emp);
		System.out.println("The data updated successfully in the database");
				
		//delete
		emp=service.retrieveEmployee(101);
		service.removeEmployee(emp);
		System.out.println("The data deleted successfully from the database");
				
				
		//retrieve
		emp=service.retrieveEmployee(102);
		System.out.println("Emp ID: "+emp.getId());
		System.out.println("Emp Name: "+emp.getName());
		
	}

}
