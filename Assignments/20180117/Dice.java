package com.gta.dice;

public class Dice {

	public int value;

	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}

	public static void main(String[] args) {
		Dice d1 = new Dice();
		d1.roll();
		System.out.println("The value is " + d1.value);
	}

}
