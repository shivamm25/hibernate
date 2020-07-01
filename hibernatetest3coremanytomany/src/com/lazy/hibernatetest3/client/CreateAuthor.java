package com.lazy.hibernatetest3.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lazy.hibernatetest3.entity.Book;
import com.lazy.hibernatetest3.entity.Author;
import com.lazy.hibernatetest3.util.HibernateUtil;

public class CreateAuthor {

	public static void main(String[] args) {
		
	 Session session = null;
	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 session= sessionFactory.openSession();
	Transaction transaction= session.getTransaction();
	transaction.begin();
	 
	  Book book1 = new Book();
	  book1.setName("java");
	 
	
	  Author author1 = new Author();
	  author1.setName("shivam");
	  author1.setContact(9873122665l);
	  author1.setEmail("shivam@gmail.com");
	  author1.getBook().add(book1);
	  
	  
	  Author author2 = new Author();
	  author2.setName("shivam");
	  author2.setContact(9873122665l);
	  author2.setEmail("shivam@gmail.com");
	  author2.getBook().add(book1);
	 
	
	 
	  book1.getAuthor().add(author1);
	 
	  session.persist(author1);
	  session.persist(author2);
		 
	  session.persist(book1);
		 
	 
	 
	transaction.commit();
	if(session!=null)
	{
		session.close();
	} 

	}

}
