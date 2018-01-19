package com.gta.secondLeast;

public class SecondLeast {

	public static void main(String[] args) {

		int[] numbers = { 1, 5, 4, 3};

		int secLeast = getSecondLeast(numbers);
		System.out.println(secLeast);
	}

	public static int getSecondLeast(int[] numbers) {
		int least = Integer.MAX_VALUE;
		int secLeast = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < least) {
				secLeast = least;
				least = numbers[i];
			} else if (secLeast > numbers[i]) {
				secLeast = numbers[i];
			}
		}

		return secLeast;
	}
}
