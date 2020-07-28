package com.lazy.springjdbcrud;

public interface EmployeeDao {

	public int create(Employee employee);
	public int update(Employee employee);
	public int delete(Employee employee);
	

}
