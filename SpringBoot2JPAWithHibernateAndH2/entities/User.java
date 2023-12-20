package com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//Table-User

@Entity
public class User {
@Id
@GeneratedValue
private long id;


private String name;
private  String role;

protected User() {
	
}
public User(String name, String role) {
	super();
	this.name = name;
	this.role = role;
}

public long getId() {
	return id;
}

public String getName() {
	return name;
}

public String getRole() {
	return role;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
}

}
