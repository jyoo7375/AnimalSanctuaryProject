package com.skilldistillery.animals.entities;

import java.util.Random;

public class Attendant {
private Random random = new Random();

public void makeRounds(Animal[] animals) {
	for (int i = 0; i < animals.length; i++) {
		if(animals[i] == null) {
			System.out.println("The Enclosure is empty ");
			
		} else {
				int food = random.nextInt(10) + 1;
				System.out.println("Attendant : I will feed " + animals[i].getName() + " " + food + " foods");
				animals[i].eat(food);
			}
		}
	 System.out.println("Attendant: Now Time for my break!");
	}

}
