package org.tnsif.singletableinheritance;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//CHILD CLASS
@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee{
	
	//PRIVATE DATA MEMBERS
	private String deptName;

	//GETTERS AND SETTERS
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
