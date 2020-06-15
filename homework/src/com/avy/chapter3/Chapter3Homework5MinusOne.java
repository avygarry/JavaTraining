package com.avy.chapter3;

import java.util.Scanner;

public class Chapter3Homework5MinusOne  {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	
	}
	
	
	public static void main (String[] arg) {
		float num1 = readUserFloatInput("Enter the first number: ");
		float realNum1 = num1;
		float answer = --num1;
		
		
		System.out.println(realNum1 + " - 1 = " + answer);

	}
}
