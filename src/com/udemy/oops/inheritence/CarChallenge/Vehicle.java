package com.udemy.oops.inheritence.CarChallenge;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {
	private String name;
	private int wheels;
	private String color;
	private int speed;

	public Vehicle(String name, int wheels, String color, int speed) {
		super();
		this.name = name;
		this.wheels = wheels;
		this.color = color;
		this.speed = speed;
	}

	public void move(int speed) {
		System.out.println("Vehicle speed called. Speed is " + speed);
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

}
