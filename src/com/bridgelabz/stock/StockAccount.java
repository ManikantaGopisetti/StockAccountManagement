package com.bridgelabz.stock;

import java.util.List;
import java.util.Scanner;

public class StockAccount implements StockAccountInterface {

	Scanner sc = new Scanner(System.in);

	public double valueOf() {

		System.out.println(" Balance in account: " + Account.getAccount_balance());
		return Account.getAccount_balance();
	}

	public StockPortfolio findStock(String name) {
		List<StockPortfolio> temp = StockList.getStocks();

		for (StockPortfolio stock : temp) {
			if (stock.getStock_name().equals(name)) {
				return stock;
			}
		}

		return null;
	}

	public StockPortfolio createStock(String name) {
		List<StockPortfolio> temp = StockList.getStocks();

		System.out.print(" Enter the value of share: ");
		double price_of_share = sc.nextDouble();

		StockPortfolio stock = new StockPortfolio();
		stock.setStock_name(name);
		stock.setNo_of_shares(0);
		stock.setShare_price(price_of_share);
		temp.add(stock);

		StockList.setStocks(temp);

		return stock;
	}

	public void buy(int amount, String symbol) {

		if (amount > Account.getAccount_balance()) {
			System.out.println(" Insufficient funds!");
			return;
		}

		StockPortfolio stock = findStock(symbol);

		if (stock == null) {
			stock = createStock(symbol);
		}

		int no_of_shares = (int) (amount / stock.getShare_price());
		double debit_value = no_of_shares * stock.getShare_price();
		Account.debit(debit_value);
		stock.setNo_of_shares(no_of_shares + stock.getNo_of_shares());
		stock.setTotal_val_shares(stock.getNo_of_shares() * stock.getShare_price());

	}

	public void sell(int amount, String symbol) {

		StockPortfolio stock = findStock(symbol);

		if (stock == null) {
			System.out.println(" You do not possess this stock!");
			return;
		}

		int no_of_shares = (int) (amount / stock.getShare_price());

		if (no_of_shares > stock.getNo_of_shares()) {
			no_of_shares = stock.getNo_of_shares();
		}

		stock.setNo_of_shares(stock.getNo_of_shares() - no_of_shares);

		double stock_value = stock.getNo_of_shares() * stock.getShare_price();
		stock.setTotal_val_shares(stock_value);

		double credit_value = stock.getShare_price() * no_of_shares;
		Account.credit(credit_value);

	}

	public void printReport() {

		List<StockPortfolio> temp = StockList.getStocks();
		int value = 0;

		for (StockPortfolio stock : temp) {
			System.out.println(stock);
			value += stock.getTotal_val_shares();
		}

		System.out.println(" Your entire portfolio is worth: " + value);

	}

}
