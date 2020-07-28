package com.lazy.springjdbcrud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext applicationContext = null;
	applicationContext = new ClassPathXmlApplicationContext("com/lazy/springjdbcrud/EmployeeConfig.xml");
	EmployeeDaoImpl daoImpl=	(EmployeeDaoImpl) applicationContext.getBean("employeeDao");
	Employee employee = (Employee) applicationContext.getBean("employee");
	
	//int result = daoImpl.create(employee);
	
	//int result = daoImpl.update(employee);
	
	int result = daoImpl.delete(employee);
	
	System.out.println("record inserted = "+result);
		
	
		
		if(applicationContext!=null)
		{
			applicationContext.close();
		}
		
		
	}

}
