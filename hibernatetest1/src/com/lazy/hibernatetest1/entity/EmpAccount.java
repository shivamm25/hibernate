package com.lazy.hibernatetest1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmpAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="a_id")
	private int id;
	
	@Column(name="a_number")
	private String number;
	
	
	@OneToOne(cascade={CascadeType.PERSIST})
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "EmpAccount [id=" + id + ", number=" + number + "]";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	

}
