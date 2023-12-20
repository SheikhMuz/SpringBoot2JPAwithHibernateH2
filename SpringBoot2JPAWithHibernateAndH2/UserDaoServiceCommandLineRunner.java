package com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.entities.User;
import com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		 userDaoService.insert(user);
		log.info("New User is created :" + user);
	}

}
