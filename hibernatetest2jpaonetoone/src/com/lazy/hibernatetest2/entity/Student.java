package com.lazy.hibernatetest2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_id")
	private int id;
	
	@Column(name="s_name")
	private String name;
	
	@Column(name="s_contact")
	private long contact;
	
	@Column(name="s_emil")
	private String email;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="c_id")
	private College college;

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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", college="
				+ college + "]";
	}
	
	
	
	

}
