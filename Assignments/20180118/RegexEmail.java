package com.gta.regexDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the email ID: ");
		String email = scanner.next();
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(email);
		if (m.find()) {
			System.out.println(email+" is a valid email ID");
		} else {
			System.out.println(email+" is not a valid email ID");
		}
	}
}
