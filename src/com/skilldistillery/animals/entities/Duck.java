package com.skilldistillery.animals.entities;

public class Duck extends Animal {
	private static final String noise = "quack quack";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
    public void eat(int amount) {
    	System.out.println("I am eating " + amount + " of food.");
		
	}

}
