package com.sunguanjun.TryRedis.try1;

import java.util.List;

public interface DemoService {
	public List<Demo> findAll();
	
	public Demo get(String id);

	public Demo getByName(String name);
}
