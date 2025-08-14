package com.example;

public class Car {
	public String make;
	public String model;
	public int year;

	public Car() {
		this.make = "";
		this.model = "";
		this.year = 0;
	}

	public Car(String mk, String md, int yr) {
		this.make = mk;
		this.model = md;
		this.year = yr;
	}

	public void text() {
		System.out.printf("{make: %s, model: %s, year: %d}", this.make, this.model, this.year);
	}
	
}
