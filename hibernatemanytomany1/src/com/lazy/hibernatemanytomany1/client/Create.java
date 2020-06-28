package com.lazy.hibernatemanytomany1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lazy.hibernatemanytomany1.util.HibernateUtil;

public class Create {

	public static void main(String[] args) {
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		

		
		
		transaction.commit();
		if(session!=null)
		{
			session.close();
		}
		
		
	}

}
