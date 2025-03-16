package com.skilldistillery.animals.entities;

public class Cow extends Animal {
	private static final String noise = "moo";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
		
	}
	
	public void eat(int amount) {
		System.out.println("Cow: I am eating " + amount + " of hays.");
		
	}

}
