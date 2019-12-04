package com.san.aopdemo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.san.aopdemo.dao.AccountDAO;
import com.san.aopdemo.dao.MembershipDAO;
import com.san.aopdemo.service.TrafficFortuneService;

public class AroundWithLoggerDemoApp {
	private static Logger myLogger = Logger.getLogger(AroundWithLoggerDemoApp.class.getName());
	public static void main(String[] args) {
		
		// read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		TrafficFortuneService theTrafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		myLogger.info("\nMain Program: AroundDemoApp");
		
		myLogger.info("Calling getFortune");
		
		String data = theTrafficFortuneService.getFortune();
		
		myLogger.info("\nMy fortune is: "+data);
		
		myLogger.info("finished");
		
		
		// close the context
		context.close();
	}

}
