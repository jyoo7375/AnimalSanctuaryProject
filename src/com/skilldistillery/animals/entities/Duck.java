package com.skilldistillery.animals.entities;

public class Duck extends Animal {
	private static final String noise = "Duck: quack quack";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
    public void eat(int amount) {
    	System.out.println("Duck: I am eating " + amount + " of Sunflower seeds.");
		
	}

}
