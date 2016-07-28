package com.sunguanjun.TryAOP.haspara;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(CountConfig.class);
		Counter a = (Counter) context.getBean("counterA");
		AutoCounter autoCounter = (AutoCounter) context.getBean("autoCounter");
		
		a.count("xx");
		a.count("xx");
		a.count("xx");
		a.count("yy");
		
		System.out.println(autoCounter.getCount("xx"));
		System.out.println(autoCounter.getCount("yy"));
		System.out.println(autoCounter.getCount("zz"));
	}
}
