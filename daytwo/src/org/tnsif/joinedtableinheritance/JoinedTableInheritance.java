//driver class
//program to demonstrate on Joined table inheritance
package org.tnsif.joinedtableinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JoinedTableInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//Vehicle 1
		Vehicle v=new Vehicle();
		v.setVehicleNo(9881);
		v.setSpeed(45);
		v.setPrice(78699.60f);
		v.setType("Four-Wheeler");
		em.persist(v);
		
		//Vehicle 1
		Vehicle v1=new Vehicle();
		v1.setVehicleNo(0532);
		v1.setSpeed(60);
		v1.setPrice(158799.50f);
		v1.setType("Four-Wheeler");
		em.persist(v1);
		
		
		//car 1
		Car c=new Car();
		c.setBrandName("Mercedes");
		c.setPrice(5700000.80f);
		c.setSpeed(90);
		c.setType("Four Wheeler");
		c.setVehicleNo(9129);
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}
