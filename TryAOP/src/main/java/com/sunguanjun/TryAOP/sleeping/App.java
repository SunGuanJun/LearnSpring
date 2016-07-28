package com.sunguanjun.TryAOP.sleeping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:/com/sunguanjun/TryAOP/sleeping/ApplicationContext2.xml");
        Sleepable sleeper = (Sleepable)appCtx.getBean("human");
        sleeper.sleep();
	}
}
