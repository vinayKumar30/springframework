package com.org.xworks.Bottle.bean;

public class Kudaka {
	
	private String name;
	private Bottle bottle;
	
	public Kudaka() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public void setName(String name) {
		System.out.println("Invoked setName:"+name);
		this.name=name;
	}
	
	public void setBottle(Bottle b) { //ref name can be anything
		System.out.println("Invoked setBottle");
		this.bottle=b;
	}
	
	public void drinking() {
		System.out.println("Invoked Drinking");
		this.bottle.store("Water");
	}
}
