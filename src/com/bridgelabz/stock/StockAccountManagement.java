package com.bridgelabz.stock;

import java.util.Scanner;

public class StockAccountManagement {
	public static void main(String[] args) {
		System.out.println("----Welcome to stock account management program----");
		Scanner sc = new Scanner(System.in);
		StockManager sm = new StockManager();
		while (true) {
			System.out.println("Please enter your choice : " + "\n1.Add Stock" + "\n2.print stock report"
					+ "\n3.Exit program");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				sm.addStock();
				break;
				
			case 2:
				sm.printStock();
				break;
				
			case 3:
				System.out.println("Exited from stock account management program");
				sc.close();
				return;
				
			default :
				System.out.println("Enter valid choice between 1 to 3");
			}

		}

	}
}

