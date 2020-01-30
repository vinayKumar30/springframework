package com.org.xworks.Farmer.bean;

import lombok.Setter;

@Setter
public class Land {
	private String type;
	private double price;
	private boolean profit;

	public Land() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	/*
	 * public void setType(String type) { this.type = type; }
	 * 
	 * public void setPrice(double price) { this.price = price; }
	 * 
	 * public void setProfit(boolean profit) { this.profit = profit; }
	 */

	public void yeild(String crop) {
		System.out.println("Invoked yield:" + crop);
	}

}
