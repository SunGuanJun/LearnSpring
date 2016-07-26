package com.sunguanjun.TryDI.xmlwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunguanjun.TryDI.javaConfig.SingerConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * 装配信息存在xml中，需要用ClassPathXmlApplicationContext将这些信息
	 * 读取出来
	 */
    public static void main(String[] args) {
        ApplicationContext context = 
               new ClassPathXmlApplicationContext("classpath:com/sunguanjun/TryDI/"
               		+ "xmlwiring/ApplicationContext.xml");
        
        Singer singer = (Singer) context.getBean("singer");
        singer.happy();
        
     }
}
