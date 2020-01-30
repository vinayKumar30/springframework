package com.org.xworks.Farmer.bean;

public class Farmer {

	private String name;
	private int acres;
	private String location;
	private Land land;

	public Farmer() {
		System.out.println("Created \t" + this.getClass().getSimpleName()); //Class not created using this constructor
	}

	public Farmer(String name, int acres, String Location, Land land) {
		System.out.println("Created \t" + this.getClass().getSimpleName());  //Class Created using parameterized constructor
		this.name = name;
		this.acres = acres;
		this.location = location;
		this.land = land;
	}

	public void farming() {
		System.out.println("Invoked farming");
		this.land.yeild("wheat");
	}

}
