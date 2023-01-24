package com.udemy.oops.inheritence.CarChallenge;

//Challenge.
//Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
//Finally, create another class, a specific type of Car that inherits from the Car class.
//You should be able to hand steering, changing gears, and moving (speed in other words).
//You will want to decide where to put the appropriate state and behaviors (fields and methods).
//As mentioned above, changing gears, increasing/decreasing speed should be included.
//For you specific type of vehicle you will want to add something specific for that type of car.

public class Car extends Vehicle {
	private int gears;

	public Car(String name, int wheels, String color, int speed, int gears) {
		super(name, wheels, color, speed);
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void carSteering() {
		System.out.println("Cars have Steering");
	}

	public void gears(boolean speedLimit) {
		this.gears = speedLimit ? 3 : 4;
		System.out.println("Driving at gears " + getGears());
	}

	public void speed(boolean speedLimit, int speed) {
		speed = speedLimit ? super.getSpeed() : super.getSpeed() + 10;
		System.out.println("Driving at speed " + speed);
	}

	@Override
	public void move(int speed) {
		super.move(80);
		System.out.println("The car is moving at " + speed);
	}

}
