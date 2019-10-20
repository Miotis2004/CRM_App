package com.americanx.admincrm.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role 
{
	//Constructors
	public Role() {
		super();
	}
	public Role(String name) {
		super();
		this.name = name;
	}
	public Role(String name, List<User> users) {
		super();
		this.name = name;
		this.users = users;
	}
	
	//Variables
	@Id
	private String name;
	@ManyToMany(mappedBy="roles")
	private List<User> users;
	
	//Accessors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
