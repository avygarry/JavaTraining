package com.avy.chapter3;

import java.util.Scanner;

public class Chapter3Homework4Mutiplication {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	
	}
	
	
	public static void main (String[] arg) {
		float num1 = readUserFloatInput("Enter the first number: ");
		float num2 = readUserFloatInput("Enter the second number: ");
		float answer = num1 * num2;
		
		System.out.println(num1 + " x " + num2 + " = " + answer);

	}
}