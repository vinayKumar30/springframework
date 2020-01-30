package com.org.xworks.Farmer.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.xworks.Farmer.bean.Farmer;

public class TesterClass {

	public static void main(String args[]) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
			Farmer refOfFarmer = container.getBean(Farmer.class);
			refOfFarmer.farming();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}
	}

}
