package com.lazy.hibernatetest4.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lazy.hibernatetest4.entity.Car;
import com.lazy.hibernatetest4.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
		entityManager = entityManagerFactory.createEntityManager();
		
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	
	Employee employee1 = new Employee();
	employee1.setName("shivam");
	
	Employee employee2 = new Employee();
	employee2.setName("sharma");
	
	Employee employee3 = new Employee();
	employee3.setName("rahul");

	Car car1= new Car();
	car1.setName("bmw");
	
	Car car2= new Car();
	car2.setName("audi");
	
	employee1.getCar().add(car1);
	employee2.getCar().add(car1);
	
	
	employee3.getCar().add(car2);
	employee1.getCar().add(car2);
	
	entityManager.persist(employee1);
	entityManager.persist(employee2);
	entityManager.persist(employee3);
	entityManager.persist(car1);
	entityManager.persist(car2);
	
	
	
	entityTransaction.commit();
		
		if(entityManager!=null)
		{
			entityManager.close();
		}

	}

}
