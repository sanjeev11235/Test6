package com.san.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.san.aopdemo.dao.AccountDAO;
import com.san.aopdemo.dao.MembershipDAO;
import com.san.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		
		// read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		TrafficFortuneService theTrafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nMain Program: AroundDemoApp");
		
		System.out.println("Calling getFortune");
		
		String data = theTrafficFortuneService.getFortune();
		
		System.out.println("\nMy fortune is: "+data);
		
		System.out.println("finished");
		
		
		// close the context
		context.close();
	}

}
