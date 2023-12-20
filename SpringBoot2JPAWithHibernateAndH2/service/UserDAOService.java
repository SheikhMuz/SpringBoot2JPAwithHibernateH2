package com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.service;

import org.springframework.stereotype.Repository;

import com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.entities.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User  user) {
		//open transaction
		entityManager.persist(user);
		//Close transaction
		return user.getId();
	}
}
