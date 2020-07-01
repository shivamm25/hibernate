package com.lazy.hibernatetest2.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lazy.hibernatetest2.entity.College;
import com.lazy.hibernatetest2.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
		entityManager = entityManagerFactory.createEntityManager();
		
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	
	Student student = new Student();
	College college = new College();
	
	college.setName("Jspider");
	college.setContact(123455l);
	college.setStudent(student);
	
	

	student.setName("shivam");
	student.setContact(9873122665l);
	student.setEmail("shivam@gmail.com");
	student.setCollege(college);
	
	entityManager.persist(student);
	
	entityTransaction.commit();
		
		if(entityManager!=null)
		{
			entityManager.close();
		}

	}

}
