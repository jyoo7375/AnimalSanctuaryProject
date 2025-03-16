package com.skilldistillery.animals.entities;

public class Animal {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return "Animal";
	}
	
	public void makeNoise() {
		
		
	}
	public void eat(int amount) {
		System.out.println("I'm eating " + amount + "foods");
	}
	
}


