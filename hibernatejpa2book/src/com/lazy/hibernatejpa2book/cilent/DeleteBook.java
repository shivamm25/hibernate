package com.lazy.hibernatejpa2book.cilent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBook {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
		entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityTransaction.commit();
		if(entityManager!=null)
		{
			entityManager.close();
		}

	}

}
