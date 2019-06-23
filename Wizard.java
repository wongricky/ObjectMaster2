package com.objectmaster;

public class Wizard extends Human {
	
	public Wizard() {
		super.health = 50;
		super.intelligence = 8;
	}

	public void heal(Human player) {
		player.health += (3 * this.intelligence);
		System.out.println("Heal");
	}
	
	public void fireball(Human player) {
		player.health -= (3 * this.intelligence);
		System.out.println("Fireball");
	}
}
