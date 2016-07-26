package com.sunguanjun.TryDI.autowiring;

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
	 * 虽然是自动发现和装配，但是还是需要Spring主m动声明ComponentScan打开
	 * 需要加载上下文，可以通过xml或者JavaConfig
	 */
    public static void main(String[] args) {
        ApplicationContext context = 
               new ClassPathXmlApplicationContext("classpath:com/sunguanjun/TryDI/"
               		+ "autowiring/ApplicationContext.xml");
//        AnnotationConfigApplicationContext context = 
//    			new AnnotationConfigApplicationContext(SingerConfig.class);
        
        Singer singer = (Singer) context.getBean("singer");
        singer.happy();
        
     }
}
