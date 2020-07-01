package com.lazy.hibernatetest1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lazy.hibernatetest1.entity.EmpAccount;
import com.lazy.hibernatetest1.entity.Employee;
import com.lazy.hibernatetest1.util.HibernateUtil;

public class ReadEmployee {

	public static void main(String[] args) {
		
	 Session session = null;
	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 session= sessionFactory.openSession();
	Transaction transaction= session.getTransaction();
	transaction.begin();
	 
	 EmpAccount account = new EmpAccount();
	 Employee employee = new Employee();
	 
	 account.setNumber("QWerty1234");
	 account.setEmployee(employee);
	 
	
	 employee.setName("shivame");
	 employee.setContact(9873122665l);
	 employee.setCompanyName("fresher");
	 employee.setEmpAccount(account);
	 
	 session.persist(employee);
	 
	 
	transaction.commit();
	if(session!=null)
	{
		session.close();
	} 

	}

}
