package com.lazy.hibernatemanytomany1.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="m_id")
	private int id;
	
	@Column(name="m_name")
	private String name;
	
	@ManyToMany(mappedBy="movie",cascade={CascadeType.PERSIST})
	private Set<Actor>actor = new HashSet<Actor>();

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

	public Set<Actor> getActor() {
		return actor;
	}

	public void setActor(Set<Actor> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + "]";
	}
			

}
