package com.lazy.hibernatetest4.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_id")
	private int id;
	
	@Column(name="e_name")
	private String name;
	
	@ManyToMany(cascade={CascadeType.PERSIST})
	@JoinColumn(name="e_id")
	private List<Car> car = new LinkedList<Car>();

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

	

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", car=" + car + "]";
	}

	
	
}
