package com.avy.chapter4;

import java.util.Scanner;

public class Homework3  {
	public static float readUserFloatInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}
		
	public static void main (String[] arg) {
		float grade = readUserFloatInput("Enter you grade: ");
		if (grade>100) {
			System.out.print("You totally got a " + grade);
		}
		if (grade<101 && grade>90) {
			System.out.print("You have A+! Good job beta.");
		}
		if (grade<91 && grade>80) {
			System.out.print("You have A! It's ok job beta.");
		}
		if (grade<81 && grade>70) {
			System.out.print("You have B+! If you ever do this again, you are getting whooped.");
		}
		if (grade<71 && grade>60) {
			System.out.print("This is not the reason you were born! You failure.");
		}
		if (grade<61 && grade>50) {
			System.out.print("Get out of the house before I pull out the chappal! You fool!");
		}
		if (grade<51) {
			System.out.print("Honey, how do you put up a kid for adoption.");
		}
	}
	}