package com.lazy.hibernatemanytoone1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lazy.hibernatemanytoone1.entity.Student;
import com.lazy.hibernatemanytoone1.util.HibernateUtil;

public class ReadStudent {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		session =sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		Student student = session.get(Student.class,1);
		System.out.println(student);
		
		transaction.commit();
		
		if(session!=null)
		{
			session.close();
		}
		
		

	}

}
