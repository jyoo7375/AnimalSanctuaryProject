package com.skilldistillery.animals.entities;

import java.util.Random;

public class Attendant {
private Random random = new Random();
private boolean endrounds = false;

public void makeRounds(Animal[] animals) {
	boolean foundAnimal = false;
	
	for (int i = 0; i < animals.length; i++) {
		if(animals[i] == null) {
			System.out.println("The Enclosure is empty ");
			endrounds = true;
			return;
			
		} else {
				int food = random.nextInt(10) + 1;
				System.out.println("Attendant : I will feed " + animals[i].getName() + " " + food + " foods");
				animals[i].makeNoise();
				animals[i].eat(food);
			}
		}
		if (!foundAnimal) {
			System.out.println("Attendant: Enclsoure is empty my work is done!");
			endrounds = true;
		}
		System.out.println("Attendant: Now time for my break!");
	}
	
	public boolean endRounds() {
		return endrounds;
	}
	

}
