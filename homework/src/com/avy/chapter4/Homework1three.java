package com.avy.chapter4;

import java.util.Scanner;

public class Homework1three  {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}
	
		
	public static void max (String[] arg) {
		float number1 = readUserFloatInput("Enter the first number: ");
		float number2 = readUserFloatInput("Enter the second number: ");
		float number3 = readUserFloatInput("Enter the third number: ");
		float number4 = readUserFloatInput("Enter the fourth number: ");
		float maxNum = 1; 
		if (number1 > number2) {
			maxNum = number1;
		}	else {
			maxNum = number2;
		if (maxNum < number3) {
			maxNum = number3;
		if (maxNum < number4) {
			maxNum = number4;
		System.out.println(maxNum + " is the greatest number");
		
		}
			
		}
		}
	}
	}