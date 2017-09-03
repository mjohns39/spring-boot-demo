package com.example.demo.configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Car;
import com.example.demo.domain.Music;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.MusicRepository;

@Configuration
public class InitializationConfiguration {

	@Bean
	public CommandLineRunner initCars(CarRepository carRepository) {
		return (args) -> {
			carRepository.save(new Car("abc1234def5672014", "2014", "Toyota", "Blue"));
			carRepository.save(new Car("abc1234def5672015", "2015", "Chevy", "Black"));
			carRepository.save(new Car("abc1234def5672016", "2016", "Ford", "Red"));
			carRepository.save(new Car("abc1234def5672013", "2013", "Toyota", "White"));
			carRepository.save(new Car("abc1234def5672000", "2000", "Toyota", "Silver"));

		};
	}
	
	@Bean
	public CommandLineRunner initMusic(MusicRepository musicRepository) {
		return (args) -> {
			musicRepository.save(new Music("Southern Comfort Zone", "Brad Paisley", "Wheelhouse"));
			musicRepository.save(new Music("We Are Tonight", "Billy Currington", "We Are Tonight"));
			musicRepository.save(new Music("Beers Ago", "Toby Keith", "Clancy's Tavern"));
			musicRepository.save(new Music("Red Dirt Road", "Brooks & Dunn", "#1s...And Then Some"));
			musicRepository.save(new Music("Springsteen", "Eric Church", "Cheif"));
		};
	}
	
	
	
	
}
