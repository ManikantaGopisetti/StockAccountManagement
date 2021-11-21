package com.bridgelabz.stock;

import java.util.Scanner;

public class StockAccountManagement {
	public static void main(String[] args) {
		System.out.println("----Welcome to stock account management program----");
		Scanner sc = new Scanner(System.in);
		
		StockAccount sa = new StockAccount();

		while (true) {
			System.out.println("Please enter your choice : " + "\n1. Buy Shares\n 2. Sell Shares\n "
						+ "3. Credit Account\n 4. Debit Account\n "
						+ "5. Print Account Balance\n 6. Print Portfolio Details\n 7. Exit");
				System.out.print(" Please enter your choice: ");
				int ch = sc.nextInt();
				int amount;
				String symbol;
				switch(ch) {
				case 1:
					System.out.print(" Enter which stock you want to buy: ");
					symbol = sc.next();
					System.out.print(" Enter amount to be spent on shares: ");
					amount = sc.nextInt();
					sa.buy(amount, symbol);
					break;
				case 2:
					System.out.print(" Enter which stock you want to sell: ");
					symbol = sc.next();
					System.out.print(" Enter value of shares to be sold: ");
					amount = sc.nextInt();
					sa.sell(amount, symbol);
					break;
				case 3:
					System.out.println("Enter amount to deposit in account : "); 
					amount = sc.nextInt();
					Account.credit(amount);
					break;
				case 4:
					System.out.println("Enter amount to withdraw from account : ");
					amount = sc.nextInt();
					Account.debit(amount);
					break;
				case 5: 
					sa.valueOf();
					break;
				case 6: 
					sa.printReport();
					break;
				case 7:
					System.out.println(" Exiting stock account management program");
					sc.close();
					return;
				default:
					System.out.println(" Please enter a valid choice");
					
				}
			}
	}
}

