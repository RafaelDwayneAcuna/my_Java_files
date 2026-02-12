package codetraning;

import java.util.Scanner;

public class miniproject {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String position;
		String name;
		int daysWorked = 0;
		
		int rate = 0;
		double gross;
		double SSS = 0.10;
		double tax = 0;
		double netIncome;
		double dollars;
		int medicare = 100;
		double bonus;
		double totalDeduction;
		
		System.out.println("What is your name: ");
		scanner.nextLine();
		
		System.out.println("What is your position?");
		System.out.println("<m> Manager <s> Supervisor <e> Employee");
		position = scanner.nextLine().toLowerCase();
		
		if(position.equals("m")) {
			rate = 500;
		}else if (position.equals("s")) {
			rate = 400;
		}else if (position.equals("e")) {
			rate = 300;
		}else {
			System.out.println("Invalid Position 67");
		}
		
		System.out.println("\nRate: " +rate);
		
		System.out.println("Number of Days worked: ");
		daysWorked = scanner.nextInt();
		
		
		gross = rate * daysWorked;
		System.out.println("\nGross: "+ gross);
		
		if(gross >= 8000.0) {
			bonus = 1000;
		}else if (gross >= 5000.0) {
			bonus = 750;
		}else if (gross >= 3000.0) {
			bonus = 500;
		}else {
			bonus = 0.0;
		}
		
		System.out.println("Bonus: " + bonus);

		if(gross >= 7000) {
			tax = 0.15 * gross;
		}else if (gross >= 4000) {
			tax = 0.10 * gross;
		}else if (gross >= 2000) {
			tax = 0.5 * gross;
		}else {
			tax = 0.0 * gross;
		}
		System.out.println("\tTax: " + tax);
		
		SSS = gross * SSS;
		System.out.println("\tSSS: "+SSS);
		System.out.println("\tMedicare: "+ medicare);
		
		totalDeduction = SSS + medicare + tax;
		System.out.println("Total Deduction: "+totalDeduction);
		
		netIncome = gross + bonus - totalDeduction;
		System.out.println("\nNet Income: " + netIncome);
		
		dollars = netIncome / 58;
		System.out.println("Translation in dollars: " + dollars);
		
	}

}
