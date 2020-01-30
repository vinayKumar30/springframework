package com.org.xworks.Labour.bean;

public class Labour {

	private String name;
	private int experiance;
	private TClass tClass;

	public Labour() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public Labour(String name) {
		System.out.println("Created \t"+this.getClass().getSimpleName());
		System.out.println("Labour name:" + name);
	}

	public void setExperience(int experience) {
		this.experiance = experience;
		System.out.println("Labour exp:" + experience);
	}

	public void setTClass(TClass tClass) {
		this.tClass = tClass;
	}

	public void work() {
		System.out.println("Invoked work");
		this.tClass.run();
		this.tClass.start("Working");

	}

}
