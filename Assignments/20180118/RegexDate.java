package com.gta.regexDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the date: ");
		String date = scanner.next();
		Pattern p = Pattern.compile("[0-9]+[.|-|/][0-9]+[.|-|/][0-9]{2,4}");
		Matcher m = p.matcher(date);
		if (m.find()) {
			System.out.println(date+" is a valid date");
		} else {
			System.out.println(date+" is not a valid date");
		}
	}
}
