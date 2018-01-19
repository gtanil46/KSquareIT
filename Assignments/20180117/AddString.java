package com.gta.addString;

public class AddString {

	public static void main(String[] args) {
		// The two strings to be added
		String s1 = "1234"; //TODO: Make it compatible with negative nums
		String s2 = "4321";

		// Get integer value from each string 
		int num1 = getInt(s1, s1.length());
		int num2 = getInt(s2, s2.length());
		
		// Add both integers
		String sum = "" + (num1 + num2);

		System.out.println("The sum is " + sum);
	}

	// Convert String to integer
	public static int getInt(String s, int len) {
		int num = 0;
		for (int i = 0; i < len; i++) {
			num = num + ((int) s.charAt(i) - 48) * (int) Math.pow(10, len - 1 - i);
		}
		return num;
	}
}
