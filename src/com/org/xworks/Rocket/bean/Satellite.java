package com.org.xworks.Rocket.bean;

public class Satellite {

	private String name;
	
	public Satellite() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Satellite name:"+name);
	}

	public void launch(String what) {
		System.out.println("Invoked launch:"+what);

	}

}
