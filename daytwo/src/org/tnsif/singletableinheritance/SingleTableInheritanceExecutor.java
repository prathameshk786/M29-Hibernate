package org.tnsif.singletableinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//driver class
//program to demonstrate on Single-Table Inheritance
public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//CREATE EMPLOYEE-1
		Employee emp=new Employee();
		emp.setEmpName("Prabal Nair");
		emp.setSalary(30680.5f);
		em.persist(emp);
		
		//CREATE EMPLOYEE-1
		Employee emp1=new Employee();
		emp1.setEmpName("Ankita yadav");
		emp1.setSalary(50000.5f);
		em.persist(emp1);
		
		//Create Manager
		Manager m=new Manager();
		m.setEmpName("Shiwani K");
		m.setSalary(89700.6f);
		m.setDeptName("Human Resource");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		

	}

}
