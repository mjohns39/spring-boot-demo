package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.domain.Car;

@CrossOrigin
public interface CarRepository extends JpaRepository<Car, Long>{

	public List<Car> findByBrand(@Param("brand") String brand);
}
