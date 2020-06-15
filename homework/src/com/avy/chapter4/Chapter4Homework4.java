package com.avy.chapter4;

import java.util.Scanner;

public class Chapter4Homework4  {
	public static int readUserIntInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
		
	public static void main (String[] arg) {
		int math = readUserIntInput("Enter you grade for Algebra II: ");
		int english = readUserIntInput("Enter you grade for English: ");
		int latin = readUserIntInput("Enter you grade for Latin I: ");
		int science = readUserIntInput("Enter you grade for Science: ");
	}
}