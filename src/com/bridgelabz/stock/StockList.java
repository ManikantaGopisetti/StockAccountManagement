package com.bridgelabz.stock;

import java.util.ArrayList;
import java.util.List;

public class StockList {
	
	
	private static List<StockPortfolio> stocks = new ArrayList<StockPortfolio>();
	
	private static double total_value;

	public static List<StockPortfolio> getStocks() {
		return stocks;
	}

	public static void setStocks(List<StockPortfolio> stocks) {
		StockList.stocks = stocks;
	}

	public static double getTotal_value() {
		return total_value;
	}

	public static void setTotal_value(double total_value) {
		StockList.total_value = total_value;
	}

}
