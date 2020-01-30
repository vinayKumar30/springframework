package com.org.xworks.Bottle.bean;

public class Bottle {
	
	private String type;
	private double size;
	
	
	public Bottle() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public Bottle(String type, double size) {
		System.out.println("Created using paramertized cons:\t"+this.getClass().getSimpleName());
		this.type = type;
		this.size = size;
	}
	
	public void store(String what) {
		System.out.println("Invoked store:"+what);
	}


	
}
