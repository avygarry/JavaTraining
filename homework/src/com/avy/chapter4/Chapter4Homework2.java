package com.avy.chapter4;

import java.util.Scanner;

public class Chapter4Homework2  {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}

	public static void main (String [] arg) {
		float L = readUserFloatInput("Enter how much money you need: ");
		float I = readUserFloatInput("Enter the Interest Rate: ");
		float LPMonths = readUserFloatInput("Enter how long it will take for you to return all of the money in months: ");
		
		float A = LPMonths*LPMonths;
		float B = I+1;
		float C = B*A;
		float D = C-1;
		float E = C/D;
		float F = L*I;
		
		float EMI = E*F;
		
//Final Print
		System.out.println("-----------------------------------------------");
		System.out.println("EMI Calculator");
		System.out.println("Equated Monthly Instalment");
		System.out.println("Your EMI is "+EMI+" per month.");
		System.out.println("-----------------------------------------------");
		
		
		
		
		
	}
}