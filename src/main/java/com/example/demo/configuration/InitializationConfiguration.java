package com.example.demo.configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Car;
import com.example.demo.repository.CarRepository;

@Configuration
public class InitializationConfiguration {

	@Bean
	public CommandLineRunner init(CarRepository userRepository) {
		return (args) -> {
			userRepository.save(new Car("abc1234def5672014", "2014", "Toyota", "Blue"));
			userRepository.save(new Car("abc1234def5672015", "2015", "Chevy", "Black"));
			userRepository.save(new Car("abc1234def5672016", "2016", "Ford", "Red"));
			userRepository.save(new Car("abc1234def5672013", "2013", "Toyota", "White"));
			userRepository.save(new Car("abc1234def5672000", "2000", "Toyota", "Silver"));

		};
	}
	
	
}
