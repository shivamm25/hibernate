package com.lazy.hibernatejpa2book.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Chapter {

	private int no;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	private String content;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Chapter [no=" + no + ", content=" + content + "]";
	}
	
	
	
	
}
