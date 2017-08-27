package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.User;

public interface UserRepository extends JpaRepository<User, String>{

	public User findByUserName(@Param("username") String userName);
}
