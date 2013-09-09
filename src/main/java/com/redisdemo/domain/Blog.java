package com.redisdemo.domain;

import java.util.Date;
import java.util.UUID;

public class Blog {

	private String id;
	private String title;
	private String text;
	private Date publishedOn = new Date();
	
	public Blog(String title, String text) {
		super();
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.text = text;
	}
	
	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(Date publishedOn) {
		this.publishedOn = publishedOn;
	}
	
	
}
