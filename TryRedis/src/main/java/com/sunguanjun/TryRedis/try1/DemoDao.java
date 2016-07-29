package com.sunguanjun.TryRedis.try1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DemoDao {
	List<Demo> list = null;
	
	public DemoDao(){
		list = new ArrayList<Demo>();
		list.add(new Demo("aa","aaaaaaaaaaaa"));
		list.add(new Demo("bb","bbbbbbbbbbbb"));
		list.add(new Demo("cc","cccccccccccc"));
	}
	
	public List<Demo> findAll(){
		return list;
	}
	
	public Demo get(String id){
		System.out.println("hhh");
		return list.get(1);
	}
	
	public Demo getByName(String name){
		return list.get(2);
	}
}
