package com.skilldistillery.animals.entities;

public class Cat extends Animal{
	private static final String noise = "Cat: Meow";
	
	@Override
	public String getType() {
		return "Cat";
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
    public void eat(int amount) {
    	System.out.println("Cat: I am eating " + amount + " of fishes.");
		
	}
}
