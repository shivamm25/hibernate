package com.lazy.hibernatemanytomany1.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="a_id")
	private int id;
	
	@Column(name="a_name")
	private String name;
	
	@ManyToMany(cascade={CascadeType.PERSIST})
	@JoinColumn(name="m_id")
	private Set<Movie> movie = new HashSet<Movie>();
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
	public Set<Movie> getMovie() {
		return movie;
	}
	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", movie=" + movie + "]";
	}
	
}
