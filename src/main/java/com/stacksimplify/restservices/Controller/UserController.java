package com.stacksimplify.restservices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.Entity.User;
import com.stacksimplify.restservices.Services.UserService;

// controller
@RestController
public class UserController {
	//get all users method
     @Autowired
	 private UserService userService;
     
     // get all users method
     @GetMapping("/users")
     public List<User> getAllUsers(){
    	 
    	 return userService.getAllUsers();
     }
     
     // create user method
    @PostMapping("/users") 
    public User createUser(@RequestBody User user) {
    	return userService.createUser(user);
    }
    
    
    // get user by Id
    @GetMapping("/users/{id}")
    public Optional<User> getuserById(@PathVariable("id") Long id){
    	return userService.getUserById(id);	
    }
    
    // update user by Id
    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable("id") Long id, @RequestBody User user){
       return userService.upadateUserById(user, id);
    }  
    
    // delete user by id
    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id) {
    	 userService.deleteUserById(id);
     }
    
    //get user by useraname
    @GetMapping("users/byusername/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {
      return userService.getUserByUsername(username);
      }
    
    }
