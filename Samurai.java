package com.objectmaster;

public class Samurai extends Human {
	static int noOfSamurais= 0;
	
	public Samurai() {
		super.health = 200;
		noOfSamurais += 1;
	}
	
	public void deathBlow(Human player) {
		player.health = 0;
		this.health -= (this.health / 2);
		System.out.println("Deathblow");
	}
	
	public void meditate() {
		this.health = 200;
		System.out.println("Meditate");
	}
	
	public int howMany() {
		return noOfSamurais;
	}
}
