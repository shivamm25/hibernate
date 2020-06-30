package com.lazy.hibernatejpa2book.cilent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lazy.hibernatejpa2book.entity.Author;

public class ReadBook {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
		entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Author author= entityManager.find(Author.class, 1);
		
		System.err.println(author);
		
		
		entityTransaction.commit();
		if(entityManager!=null)
		{
			entityManager.close();
		}
		
	

	}
// need to do this file
}
