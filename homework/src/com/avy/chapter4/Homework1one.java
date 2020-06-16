package com.avy.chapter4;

import java.util.Scanner;

public class Homework1one  {
	public static int readUserIntInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	
	}
	
	
	public static void main (String[] arg) {
		int number = readUserIntInput("Enter a Number: ");
		if (number > 100) {
			System.out.println(number);
		}

	}
}
