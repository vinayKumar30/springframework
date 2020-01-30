package com.org.xworks.Rocket.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.xworks.Rocket.bean.Rocket;

public class RocketTester {

	public static void main(String args[]) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("resources/context.xml");
			Rocket refOfRocket = container.getBean(Rocket.class);
			refOfRocket.start();
			refOfRocket.launch();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}
	}

}
