package com.stacksimplify.restservices.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.Entity.User;
import com.stacksimplify.restservices.Repositories.UserRepository;



// services
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	// get all users method
	public List<User> getAllUsers() {
	   return userRepository.findAll();
}
	
	// create user method
	 public User createUser( User user) {
    	 return userRepository.save(user);
    	 	 
     }
	 // get user by userId
	 
	 public Optional<User> getUserById(long id) {
		 Optional<User> user=userRepository.findById(id);
		 return user;
	 }
	 // update user by id
	 
	 public User upadateUserById(User user, long id) {
       user.setId(id);
       return userRepository.save(user);
		}
	 
	 // delete user by id
	 
	 public void deleteUserById(long id) {
	   if(userRepository.findById(id).isPresent()) {
		   userRepository.deleteById(id);
	   }
	   
	 }
	 
	 // get user by username
	   
	   public User getUserByUsername(String username) {
		   return userRepository.findByUsername(username);
	   }
	   
}