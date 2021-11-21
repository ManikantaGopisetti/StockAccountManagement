package com.bridgelabz.stock;

import java.util.Scanner;

public class Account {
	int account_balance = 0;
	Scanner sc = new Scanner(System.in);

	public void debit() {

		System.out.print("Enter amount to Withdraw: ");
		int amount = sc.nextInt();
		if (amount < account_balance) {
			account_balance -= amount;
			System.out.println(amount + "$" + " debited from your account \n" 
								+ "Remaining acount balance : "+ account_balance + "$");
		} else {
			System.out.println("Debit amount exceeded account balance");
		}
	}

	public void credit() {
		System.out.print("Enter amount to deposit: ");
		int amount = sc.nextInt();
		account_balance += amount;
		System.out.println(amount + "$" + " credited to your account \n " 
						+ "Remaining acount balance : " + account_balance + "$");

	}
}