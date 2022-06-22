package com.alebarth.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alebarth.workshopmongodb.domain.User;
import com.alebarth.workshopmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
