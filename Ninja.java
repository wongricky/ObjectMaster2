package com.objectmaster;

public class Ninja extends Human {

	public Ninja() {
		super.stealth = 10;
	}
	
	public void steal(Human player) {
		this.health += player.stealth;
		System.out.println("Steal");
	}
	
	public void runaway() {
		this.health -= 10;
		System.out.println("Runaway");
	}
}
