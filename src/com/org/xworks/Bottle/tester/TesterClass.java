package com.org.xworks.Bottle.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.xworks.Bottle.bean.Kudaka;


public class TesterClass {
	
	public static void main(String args[]) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("resources/context.xml");
			Kudaka refOfKuduka = container.getBean(Kudaka.class);
			refOfKuduka.drinking();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("INFO:"+e.getMessage());
		}
	}

}
