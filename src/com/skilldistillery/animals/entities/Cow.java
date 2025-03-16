package com.skilldistillery.animals.entities;

public class Cow extends Animal {
	private static final String noise = "Cow: moo";
	
	@Override
	public String getType() {
		return "Cow";
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
		
	}
	
	public void eat(int amount) {
		System.out.println("Cow: I am eating " + amount + " of hays.");
		
	}

}
