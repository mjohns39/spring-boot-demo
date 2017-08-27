package com.example.demo.configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Configuration
public class InitializationConfiguration {

	@Bean
	public CommandLineRunner init(UserRepository userRepository) {
		return (args) -> {
			userRepository.save(new User("John", "Snow"));
			userRepository.save(new User("Aria", "Stark"));
			userRepository.save(new User("Sansa", "Stark"));
			userRepository.save(new User("Dany", "Targaryen"));
			userRepository.save(new User("Tyrion", "Lannister"));

		};
	}
	
	
}
