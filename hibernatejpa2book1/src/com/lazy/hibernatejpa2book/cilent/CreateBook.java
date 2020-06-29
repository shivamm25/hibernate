package com.lazy.hibernatejpa2book.cilent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lazy.hibernatejpa2book.entity.Author;
import com.lazy.hibernatejpa2book.entity.Book;
import com.lazy.hibernatejpa2book.entity.Chapter;

public class CreateBook {

	public static void main(String[] args) {
		
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
		entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Author author = new Author();
		author.setName("shivam");
		author.setContact(9873122665l);
		author.setEmail("shivam25@gmail.com");
		
		
		Chapter chapter = new Chapter();
		chapter.setName("java");
		chapter.setContent("java concepts");
		
		
		Book book = new Book();
		book.setName("abc");
		book.setAuthor(author);
        book.setChapter(chapter);
		
		author.getBook().add(book);
		
		
		entityManager.persist(book);
		entityManager.persist(author);
		
	
		
		
		entityTransaction.commit();
		if(entityManager!=null)
		{
			entityManager.close();
		}

	}

}

// have to dooo
