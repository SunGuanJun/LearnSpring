package com.sunguanjun.TryAOP.sleeping2;

import org.springframework.stereotype.Component;


//核心业务类
@Component
public class Human implements Sleepable {

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("睡觉了");
	}

}
