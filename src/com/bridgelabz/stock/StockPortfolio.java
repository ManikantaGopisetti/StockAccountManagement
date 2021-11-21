package com.bridgelabz.stock;

public class StockPortfolio {
	
	private String stock_name;
	private int no_of_shares;
	private double share_price;
	private double total_val_shares;
	
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public int getNo_of_shares() {
		return no_of_shares;
	}
	public void setNo_of_shares(int no_of_shares) {
		this.no_of_shares = no_of_shares;
	}
	public double getShare_price() {
		return share_price;
	}
	public void setShare_price(double share_price) {
		this.share_price = share_price;
	}
	public double getTotal_val_shares() {
		return total_val_shares;
	}
	public void setTotal_val_shares(double total_val_shares) {
		this.total_val_shares = total_val_shares;
	}
	@Override
	public String toString() {
		return "StockPortfolio [stock_name=" + stock_name + ", no_of_shares=" + no_of_shares + ", share_price="
				+ share_price + ", total_value_shares=" + total_val_shares + "]";
	}

}