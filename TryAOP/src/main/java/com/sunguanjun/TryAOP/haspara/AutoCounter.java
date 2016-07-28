package com.sunguanjun.TryAOP.haspara;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AutoCounter {
	private Map<String, Integer> res = new HashMap<String, Integer>();
	
	@Pointcut("execution(* com.sunguanjun.TryAOP.haspara.Counter.count(String))"
			+ " && args(name)")
	public void countName(String name){}
	
	@Before("countName(name)")
	public void autoCountName(String name){
		int currentCount = getCount(name);
		res.put(name, currentCount+1);
	}
	
	public int getCount(String name){
		return res.containsKey(name) ? res.get(name) : 0;
	}
}
