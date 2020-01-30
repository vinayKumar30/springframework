package com.org.xworks.Rocket.bean;

public class Fuel {
	private String type;

	public Fuel() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public Fuel(String type) {
		super();
		System.out.println("Created \t" + this.getClass().getSimpleName());
		System.out.println("Fuel type:"+type);
		this.type = type;
	}

	public void fire(String what) {
		System.out.println("Invoked fire:" + what);

	}

}
