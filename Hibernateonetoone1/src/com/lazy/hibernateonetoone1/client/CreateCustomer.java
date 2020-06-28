package com.lazy.hibernateonetoone1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lazy.hibernateonetoone1.entity.Customer;
import com.lazy.hibernateonetoone1.entity.Passport;
import com.lazy.hibernateonetoone1.util.HibernateUtil;

public class CreateCustomer {

	public static void main(String[] args) {
		
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		Passport passport = new Passport();
	    passport.setNumber("qwet111");
		
	
	    Customer customer = new Customer();
	    customer.setName("shivam");
	    customer.setPassport(passport);
		
		session.persist(customer);
		
		transaction.commit();
		if(session!=null)
		{
			session.close();
		}
		
	}

	}


