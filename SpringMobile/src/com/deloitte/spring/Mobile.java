package com.deloitte.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 Scanner sc= new Scanner(System.in);
	 @SuppressWarnings("resource")
	 ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
	 String simName;
	 System.out.println("Insert a sim : ");
	 simName= sc.next();
     Sim sim= (Sim)context.getBean(simName);
     sim.browse();
     sim.call();
     sim.sendSms();
     sim.sendMms();
     sc.close();
	}
  
}
