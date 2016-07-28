package com.sunguanjun.TryAOP.sleeping2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


//通知类
@Aspect
@Component
public class SleepHelper{
	@Pointcut("execution(* *.sleep())")
    public void sleeppoint(){}
	
	@Before("sleeppoint()")
	public void beforeSleep(){
		System.out.println("睡前");
	}
	
	@AfterReturning("sleeppoint()")
	public void afterSleep(){
		System.out.println("睡后");
	}
}
