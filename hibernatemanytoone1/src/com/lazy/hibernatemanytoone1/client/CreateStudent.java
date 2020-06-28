package com.lazy.hibernatemanytoone1.client;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lazy.hibernatemanytoone1.entity.Mentor;
import com.lazy.hibernatemanytoone1.entity.Student;
import com.lazy.hibernatemanytoone1.util.HibernateUtil;

public class CreateStudent 
{
	public static void main(String[] args) 
	{
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		Mentor mentor = new Mentor();
		mentor.setName("shivam1");
		mentor.setSalary(10010.00);
		mentor.setContact(98713665l);
		
		
		Student student = new Student();
		student.setName("lazy1");
		student.setEmail("lazy1@gmail.com");
		student.setContact(9813122665l);
		student.setMentor(mentor);
		
		
		
		Student student1 = new Student();
		student1.setName("lazy2");
		student1.setEmail("lazy2@gmail.com");
		student1.setContact(983122665l);
		student1.setMentor(mentor);
	
		
    /*    mentor.getStudent().add(student);
		mentor.getStudent().add(student1);*/
		
		
       Set<Student> studentref=	mentor.getStudents();
		studentref.add(student);
		studentref.add(student1);
		
		session.persist(mentor);
		
		/*session.save(student);
		session.save(mentor);*/
		
		
		
		transaction.commit();
		if(session!=null)
		{
			session.close();
		}
		
		

	}

}
