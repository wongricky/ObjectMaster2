package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO add NINJA, WIZARD, SAMURAI
		
		
		// Initialize Human objects
		Human ironman = new Human();
		Human batman = new Human();
		Human deadpool = new Human();
		
		// Initialize Wizard objects
		Wizard gandolf = new Wizard();
		
		// Initialize Ninja objects
		Ninja donatello = new Ninja();
		
		// Initialize Samurai objects
		Samurai tomcruise = new Samurai();
		Samurai pizzacat = new Samurai();
		
		// Players Human: Ironman, Batman, Deadpool
		// Players Wizard: Gandolf
		// Players Ninja: Donatello
		// Players Samurai: TomCruise, PizzaCat
		
		// Game start
		
		ironman.attack(donatello);
		batman.attack(deadpool);
		deadpool.attack(gandolf);
		gandolf.heal(gandolf);
		gandolf.fireball(batman);
		donatello.steal(deadpool);
		donatello.steal(gandolf);
		donatello.runaway();
		tomcruise.deathBlow(batman);
		gandolf.heal(batman);
		pizzacat.deathBlow(tomcruise);
		pizzacat.meditate();
		
		// Game end
		
		// Show number of Samurais in the game
		System.out.println("\nThere are " + tomcruise.howMany() + " samurai(s) in the game");
		
		// Display final Human health
		System.out.println("\nIronman's health: ");
		ironman.displayHealth();
		System.out.println("Batman's health: ");
		batman.displayHealth();
		System.out.println("Deadpool's health: ");
		deadpool.displayHealth();

		// Display final Wizard health
		System.out.println("Gandolf's health: ");
		gandolf.displayHealth();
		
		// Display final Ninja health
		System.out.println("Donatello's health: ");
		donatello.displayHealth();
		
		
		// Display final Samurai health
		System.out.println("Tom Cruise's health: ");
		tomcruise.displayHealth();
		System.out.println("Pizza Cat's health: ");
		pizzacat.displayHealth();
		
	}

}
