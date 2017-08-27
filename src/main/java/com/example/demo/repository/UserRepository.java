package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public List<User> findByFirstName(@Param("firstname") String firstName);
}
