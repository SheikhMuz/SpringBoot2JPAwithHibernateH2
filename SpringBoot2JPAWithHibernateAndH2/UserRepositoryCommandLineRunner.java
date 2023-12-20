package com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.entities.User;
import com.springboot.jpa.hibernate.h2.example.SpringBoot2JPAWithHibernateAndH2.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner {

	private static final Logger log= LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	
	
	private UserRepository userRepository;
	
	
	
	public void run(String... arg0) throws Exception{
		User user = new User("Jill","Admin");
	 userRepository.save(user);
	 Optional<User> userWithIdOne =userRepository.findById(1l);
	 List<User> users=userRepository.findAll();
	 log.info("New User is created : "+user);
	 log.info("User is retrieved :" + userWithIdOne );
	 log.info("All user find" +users);
	}
}
 