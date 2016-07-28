package com.sunguanjun.TryAOP.haspara;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class CountConfig {
	@Bean
	public CounterA counterA(){
		return new CounterA();
	}
	
	@Bean
	public AutoCounter autoCounter(){
		return new AutoCounter();
	}
}
