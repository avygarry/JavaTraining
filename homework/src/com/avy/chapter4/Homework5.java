package com.avy.chapter4;

import java.util.Scanner;

public class Homework5  {
	public static int readUserIntInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static void main (String [] arg) {
		System.out.print("Type Date Month for the program to print it in that format");
		System.out.print("Type Month Date for the program to print it in that format");
		System.out.readUserIntInput("");
		
	}
}