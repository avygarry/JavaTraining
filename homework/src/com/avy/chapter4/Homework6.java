package com.avy.chapter4;

import java.util.Scanner;

public class Homework6 {
	
	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static void main (String[] arg) {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("We sell Pizaazzzzzzzzzz");
		System.out.println("Here are the Pizzaz we sell");
		System.out.println("Goat Cheese Pizza - $15");
		System.out.println("This Cheese is so fresh, you'll fart!");
		System.out.println("Chicken Feet Pizza - $15");
		System.out.println("Chicken is to expensive for this restaurant, and I know a guy who sells chicken feet.");
		System.out.println("Pure Vegitarian Venus Fly Trap Pizza - $60");
		System.out.println("We sent our dudes to the Amazon Rainforest. Don't Worry! Most came back!");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Appetizers");
		System.out.println("Buffalo Wings - $7");
		System.out.println("Made from the wings of the great buffalo!");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Deserts");
		System.out.println("Brownies - $24");
		System.out.println("These brownies are fresh from the toilet! We are still hiring pro poopers.");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("There is 20% tax. Government gets 6%, we get the rest cause we broke.");
		System.out.println("--------------------------------------------------------------------------------------");
		int GCpizza = readUserIntInput("How many Goat Cheese Pizzas would you like to consume: ");
		int CFpizza = readUserIntInput("How many Chicken Feet Pizzas would you like to consume: ");
		int VFTpizza = readUserIntInput("How many Vegitarian Venus Fly Trap Pizzas would you like to consume: ");
		int BW = readUserIntInput("How many packs of Buffalo Wings would you like to consume: ");
		int Brownies = readUserIntInput("How many Brownies would you like to consume: ");
		int totalGCpizza = GCpizza*15;
		int totalCFpizza = CFpizza*15;
		int totalVFTpizza = VFTpizza*60;
		int totalBW = BW*24;
		int totalBrownies = Brownies*24;
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Avishi's Pizzaz | Always Fresh. Always Smelly | Avishi's Pizzaz");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Item                       | Quantity               | Cost             |");
		if (GCpizza < 0);
			System.out.println("Goat Cheese Pizza          | "+GCpizza+"                      | $"+ totalGCpizza +"              |");
		if (CFpizza < 0);
			System.out.println("Chicken Feet Pizza         | "+CFpizza+"                      | $"+totalCFpizza+"              |");
		if (VFTpizza < 0);
			System.out.println("Venus Fly Trap Pizza       | "+VFTpizza+"                      | $"+totalVFTpizza+"              |");
		if (BW < 0);
			System.out.println("Buffalo Wings              | "+BW+"                      | $"+totalBW+"              |");
		if (Brownies < 0);
			System.out.println("Goat Cheese Pizza          | "+Brownies+"                      | $"+totalBrownies+"              |");
		float GCTax = (float) (totalGCpizza*1.2);
		float CFTax = (float) (totalCFpizza*1.2);
		float VFTTax = (float) (totalVFTpizza*1.2);
		float BWTax = (float) (totalBW*1.2);
		float BrowniesTax = (float) (totalBrownies*1.2);
		float total = GCTax+CFTax+VFTTax+BWTax+BrowniesTax;
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Item                       | Price after Taxes                         |");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Goat Cheese Pizza          | $"+GCTax+"                                     |");
		System.out.println("Chicken Feet Pizza         | $"+CFTax+"                                     |");
		System.out.println("Venus Fly Trap Pizza       | $"+VFTTax+"                                     |");
		System.out.println("Buffalo Wings              | $"+BWTax+"                                     |");
		System.out.println("Brownies                   | $"+Brownies+"                                        |");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Total                      | $"+total+"                                    |");
		
		
		
		
		
			
			
		
		
	}
}