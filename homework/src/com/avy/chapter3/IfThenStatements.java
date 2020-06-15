package com.avy.chapter3;

import java.util.Scanner;

public class IfThenStatements  {
	public static int readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	
	}
	
	
	public static void main (String[] arg) {
		int num = readUserFloatInput("Enter the number: ");
		if (num > 21) {
			System.out.println(num + " is greater than 21. ");
		}

	}
}
