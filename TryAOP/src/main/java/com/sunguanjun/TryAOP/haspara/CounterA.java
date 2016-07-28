package com.sunguanjun.TryAOP.haspara;

public class CounterA implements Counter {

	public void count(String name) {
		System.out.println(name + " 得一票");
	}

}
