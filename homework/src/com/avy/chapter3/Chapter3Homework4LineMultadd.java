package com.avy.chapter3;

import java.util.Scanner;

public class Chapter3Homework4LineMultadd  {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	
	}
	
	
	public static void main (String[] arg) {
		float num1 = readUserFloatInput("Enter the first number: ");
		float num2 = readUserFloatInput("Enter the second number: ");
		float num3 = readUserFloatInput("Enter the third number: ");
		float answer = num1 + num2 * num3;
		
		System.out.println(num1 + " + " + num2 + " x " + num3 + " = " + answer);

	}
}
