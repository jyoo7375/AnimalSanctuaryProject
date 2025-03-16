package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {
	private Animal[] animals;
	private Attendant attendant;

	public Sanctuary() {
		animals = new Animal[3];

	}

	public void addAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void addAnimal(Animal animal, int index) {
		if (index >= 0 && index < animals.length) {
			animals[index] = animal;
		} else {
			System.out.println("Invalid index. Cannot add animal");
		}
	}

	public void listAnimals() {
		System.out.println("Animals in the Sanctuary right now: ");
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println("- " + animal.getName());
			} else {
				System.out.println("- Empty Enclosure");
			}
		}

	}

	public void startRounds() {
		if (attendant != null) {
			attendant.makeRounds(animals);
		} else {
			System.out.println("No attendant available to make rounds");
		}
	}

}
