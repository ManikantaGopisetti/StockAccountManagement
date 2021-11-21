package com.bridgelabz.stock;

import java.util.Scanner;

public class Account {
	static int account_balance = 0;
	static Scanner sc = new Scanner(System.in);

	public static void debit(double amount) {
		if (amount < account_balance) {
			account_balance -= amount;
			System.out.println(amount + "$" + " debited from your account \n" 
								+ "Remaining acount balance : "+ account_balance + "$");
		} else {
			System.out.println("Debit amount exceeded account balance");
		}
	}

	public static void credit(double amount) {
				account_balance += amount;
		System.out.println(amount + "$" + " credited to your account \n " 
						+ "Remaining acount balance : " + account_balance + "$");

	}

	public static int getAccount_balance() {
		return account_balance;
	}

	public static void setAccount_balance(int account_balance) {
		Account.account_balance = account_balance;
	}
	
	

}