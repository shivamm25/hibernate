package com.lazy.hibernatetest4.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Car {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_id")
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@ManyToMany(mappedBy="car",cascade={CascadeType.PERSIST})
	private List<Employee> employee = new LinkedList<Employee>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
	
	
}
