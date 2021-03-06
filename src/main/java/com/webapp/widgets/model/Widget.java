package com.webapp.widgets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Widget {
	
	private @Id @GeneratedValue Integer id;
	
	@NotBlank
	@Size(min=1, message="Passport should have atleast 1 characters")
	private String name;
	
	@NotBlank
	@Size(min=1, message="Passport should have atleast 1 characters")
	private String description;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Widget [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
