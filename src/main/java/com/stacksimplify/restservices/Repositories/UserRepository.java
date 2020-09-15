package com.stacksimplify.restservices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.Entity.User;

//repository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


	User findByUsername(String username);
}
