package com.sunguanjun.TryRedis.try1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DemoServiceImpl implements DemoService {

	@Autowired 
	private DemoDao demoDao;

	public List<Demo> findAll() {
		return demoDao.findAll();
	}
	
	/*
		对get()方法配置使用缓存,缓存有效期为3600秒,缓存的key格式为:{package_name}.DemoServiceImpl.get
		同时为参数配置了@CacheKey后,表示此参数的值将做为key的后缀,此例的key,最终是:{package_name}.DemoServiceImpl.get.{id}
		可以为多个参数配置@CacheKey,拦截器会调用参数的toString()做为key的后缀
		若配置多个@CacheKey参数,那么最终的key格式为:{package_name}.{class_name}.{method}.{arg1}.{arg2}.{...}
	 */
	@Cacheable(expire=3600)
	public Demo get(@CacheKey String id) {
		return demoDao.get(id);
	}

	public Demo getByName(String name) {
		return demoDao.getByName(name);
	}
}
