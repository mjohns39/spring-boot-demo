package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	private String vin;
	
	private String year;
	
	private String brand;
	
	private String color;
	
	public Car () {}
	
	public Car (String vin, String year, String brand, String color) {
		this.vin = vin;
		this.year = year;
		this.brand = brand;
		this.color = color;
		
	}


	public String getVin() {
		return vin;
	}

	public String getYear() {
		return year;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}



	
	
}
