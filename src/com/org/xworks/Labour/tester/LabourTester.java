package com.org.xworks.Labour.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.xworks.Labour.bean.Labour;

public class LabourTester {
	
	public static void main(String args[]) {
		
		try {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/context.xml");
		Labour reOfLabour = container.getBean(Labour.class);
		reOfLabour.work();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("INFO:"+e.getMessage());
		}
	}
		

}
