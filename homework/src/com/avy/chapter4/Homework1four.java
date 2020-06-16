package com.avy.chapter4;

import java.util.Scanner;

public class Homework1four  {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}
		
	public static void main (String[] arg) {
		float number1 = readUserFloatInput("Enter the first number: ");
		float number2 = readUserFloatInput("Enter the second number: ");
		float number3 = readUserFloatInput("Enter the third number: ");
		float number4 = readUserFloatInput("Enter the fourth number: ");
		float minNum = 1;
		if (number1 < number2) {
			minNum = number1;
		}	else {
			minNum = number2;
		if (minNum > number3) {
			minNum = number3;
		if (minNum > number4) {
			minNum = number4;
		}
	System.out.println(minNum + " is the smallest number");
		
		}
			
		}
		}
	}