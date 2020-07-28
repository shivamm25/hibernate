package com.lazy.springjdbcrud;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String query= " insert into employee values(?,?,?,?) ";
		int result = jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getJob(),employee.getSalary());
	return	result ;
	}

	

	@Override
	public int update(Employee employee) {
		
		String query= " update employee set name = ? , salary = ?  where id = ? ";
		int result = jdbcTemplate.update(query,employee.getName(),employee.getSalary(),employee.getId());
	return	result ;
	}
	
	@Override
	public int delete(Employee employee) {
		String query =" delete from employee where id = ?";
		int result =jdbcTemplate.update(query,employee.getId());
		return result;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
