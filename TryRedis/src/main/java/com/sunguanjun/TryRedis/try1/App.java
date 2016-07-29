package com.sunguanjun.TryRedis.try1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ApplicationContext context = 
	               new ClassPathXmlApplicationContext("classpath:com/sunguanjun/TryRedis/"
	               		+ "try1/ApplicationContext.xml");
		DemoServiceImpl service = (DemoServiceImpl) context.getBean("demoServiceImpl");
		System.out.println(service.get("aa").toString());
	}
}
