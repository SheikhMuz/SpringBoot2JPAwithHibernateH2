package com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
