package com.lazy.hibernatetest1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_id")
	private int id;
	
	@Column(name="e_name")
	private String name;
	
	@Column(name="e_contact")
	private long contact;
	
	
	@Column(name="e_company")
	private String CompanyName;

	@OneToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="a_id" ,unique=true)
	private EmpAccount empAccount;
	
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


	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public EmpAccount getEmpAccount() {
		return empAccount;
	}


	public void setEmpAccount(EmpAccount empAccount) {
		this.empAccount = empAccount;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", CompanyName=" + CompanyName
				+ ", empAccount=" + empAccount + "]";
	}


	
	
}
