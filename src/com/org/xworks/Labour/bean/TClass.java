package com.org.xworks.Labour.bean;

public class TClass extends Thread {

	public TClass() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Running..");
	}

	public void start(String what) {
		System.out.println("Invoked start:" + what);

	}

}
