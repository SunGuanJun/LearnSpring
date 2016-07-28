package com.sunguanjun.TryAOP.sleeping2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:/com/sunguanjun/TryAOP/sleeping2/ApplicationContext.xml");
        Sleepable sleeper = (Sleepable)appCtx.getBean("human");
        sleeper.sleep();
	}
}
