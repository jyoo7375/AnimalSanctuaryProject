package com.skilldistillery.animals.entities;

public class Cat extends Animal{
	private static final String noise = "Meow";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
    public void eat(int amount) {
    	System.out.println("I am eating " + amount + " of food.");
		
	}
}
