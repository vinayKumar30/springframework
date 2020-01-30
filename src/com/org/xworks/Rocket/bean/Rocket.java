package com.org.xworks.Rocket.bean;

public class Rocket {
	private String countryName;
	private Fuel fuel;
	private Satellite sat;

	public Rocket() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public Rocket(Fuel fuel) {
		System.out.println("Created \t" + this.getClass().getSimpleName());
		this.fuel = fuel;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setSat(Satellite sat) {
		this.sat = sat;
	}

	public void start() {
		System.out.println("Invoked Start method");
		this.fuel.fire("Ignited");
	}

	public void launch() {
		System.out.println("Invoked launch of Rocket");
		this.sat.launch("Begun");

	}

}
