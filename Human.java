package com.objectmaster;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	public void attack(Human player) {
		player.health -= this.strength;
		System.out.println("Basic attack");
	}
	
	public void displayHealth() {
		if (health > 0) {
			System.out.println(health);
		}
		else if (health <= 0) {
			System.out.println("player has died");
		}
	}
}
