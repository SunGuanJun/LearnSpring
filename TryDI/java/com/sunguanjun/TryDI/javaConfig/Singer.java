package com.sunguanjun.TryDI.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class Singer {
	
	private Sing sing;
	
	public Singer(Sing sing){
		this.sing = sing;
	}
	
	public Sing getSing() {
		return sing;
	}

	public void setSing(Sing sing) {
		this.sing = sing;
	}

	public  void happy(){
		sing.singing();
	}
	
}
