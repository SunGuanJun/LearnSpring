package com.sunguanjun.TryDI.xmlwiring;

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
