package com.avy.chapter4;

import java.util.Scanner;

public class Chapter4Homework4 {
	
	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static void main (String[] arg) {
		int math = readUserIntInput("Enter your score for Algebra II: ");
		int english = readUserIntInput("Enter your score for English: ");
		int latin = readUserIntInput("Enter your score for Latin I: ");
		int science = readUserIntInput("Enter your score for Science: ");
//Calculate Percentage for each 
		String mathGrade = getGradeByPercentage(math);
		String englishGrade = getGradeByPercentage(english);
		String latinGrade = getGradeByPercentage(latin);
		String scienceGrade = getGradeByPercentage(science);
		int averageFraction = (math + english + latin + science);
		int averagePercentage = (math + english + latin + science)/4;
		String APGrade = getGradeByPercentage(averagePercentage);

		
	//Final print
		System.out.println(" |      Subject       |     Score     |     Grade     |");
		System.out.println(" |     Algebra II     |      " + math +"       |       " + mathGrade + "      |");
		System.out.println(" |      English       |      " + english + "       |       " + englishGrade + "      |");
		System.out.println(" |       Latin        |      " + latin + "       |       " + latinGrade + "      |");
		System.out.println(" |      Science       |      " + science + "       |       " + scienceGrade + "      |");
		System.out.println("");
		System.out.println(" |      Average       |    " + averageFraction + "/400    |               |");
		System.out.println(" | Average Percentage |      " + averagePercentage + "       |       " + APGrade + "      |");
		
		

	}

	public static String getGradeByPercentage(float aPercentage) {
		String grade = "F";
		if (aPercentage > 90) {
			grade = "A+";
		}

		if (aPercentage <= 90 && aPercentage > 80) {
			grade = "A";
		}
		if (aPercentage <= 80 && aPercentage > 70) {
			grade = "B+";
		}
		if (aPercentage <= 70 && aPercentage > 70) {
			grade = "B";
		}
		if (aPercentage <= 60 && aPercentage > 50) {
			grade = "C";
		}
		if (aPercentage <= 50 && aPercentage > 1) {
			grade = "F";
		}
		return grade;
	}
}