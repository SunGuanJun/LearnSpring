package com.sunguanjun.TryDI.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SingerConfig {
	/*
	 * 如果不指定@Bean的name，那么这个Bean的id就是方法名
	 */
	@Bean
	public Sing sing(){
		return new SingDo();
	}
	
	@Bean
	public Singer singer(){
		return new Singer(sing());
	}
}
