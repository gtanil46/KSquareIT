package com.gta.commandLineArgs;

public class Car {

	String make, model, color;
	int year;
	float speed;
	boolean engineState;

	public Car(String make, int year) {
		this.make = make;
		model = "Prius";
		color = "Black";
		this.year = year;
		speed = 0;
		engineState = false;
	}

	public void startEngine() {
		if (engineState == false) {
			engineState = true;
			System.out.println("Engine started");
		} else {
			System.out.println("Engine already running");
		}
	}

	public void accelerate() {
		if (engineState == true) {
			speed += 5;
			System.out.println("Your speed is " + speed);
		} else {
			System.out.println("Please start the engine");
		}
	}

	public void brake() {
		if (engineState == true & speed >= 5) {
			speed -= 5;
			System.out.println("Brakes applied. Your speed is " + speed);
		}
	}

	public void stop() {
		speed = 0;
		engineState = false;
		System.out.println("Car stopped, engine turned off");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(args[0], Integer.parseInt(args[1]));
		System.out.println("Make : "+c1.make);
		System.out.println("Year : "+c1.year);
	}

}
