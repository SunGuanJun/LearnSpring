package com.sunguanjun.TryDI.autowiring;

import org.springframework.stereotype.Component;

@Component
public class SingLa implements Sing {

	public void singing() {
		// TODO Auto-generated method stub
		System.out.println("La La La");
	}

}
