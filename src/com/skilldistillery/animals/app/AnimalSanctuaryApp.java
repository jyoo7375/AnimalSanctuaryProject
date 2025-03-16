package com.skilldistillery.animals.app;

import java.util.Scanner;

import com.skilldistillery.animals.entities.Attendant;
import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Cat;
import com.skilldistillery.animals.entities.Cow;
import com.skilldistillery.animals.entities.Duck;

public class AnimalSanctuaryApp {
	private Sanctuary sanctuary;

	public static void main(String[] args) {

		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {
		Scanner sc = new Scanner(System.in);

		boolean roundStart = true;
		boolean visit = true;

		Sanctuary sanctuary = new Sanctuary();
		// instantiate a Sanctuary

		Attendant attendant = new Attendant();
		// instantiate an ATTENDANT

		sanctuary.addAttendant(attendant);
		// Add attendant to sanctuary

		Animal[] animals = { new Duck(), new Cat(), new Cow() };
		String[] animalTypes = { "Duck", "Cat", "Cow" };

		System.out.println("Welcome to the Animal Sanctuary");

		for (int i = 0; i < animals.length; i++) {
			System.out.println("Enter the name for the " + animalTypes[i] + ": ");
			animals[i].setName(sc.nextLine());
			sanctuary.addAnimal(animals[i], i);

			// Create and add animals to sanctuary
			// Have sanctuary list animals
		}
		while (visit) {
			System.out.println("\n==== Animal Sanctuary Menu ====");
			System.out.println("1. List Animals");
			System.out.println("2. Feed Animals");
			System.out.println("3. Leave Sanctuary");
			System.out.println("===============================");
			System.out.println("Enter your choice: ");
			
			if(!sc.hasNextInt()) {
				System.out.println("Invalid choice. Please enter a number between 1 and 3");
				sc.next();
				continue;
			}

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				sanctuary.listAnimals();
				break;
			case 2:
				sanctuary.startRounds();
				if (attendant.endRounds()) {
					System.out.println("Enclosure is empty No more animals to feed!");
					roundStart = false;
				}
				break;
			case 3:
				System.out.println("Goodbye! Thank you for visiting the sanctuary!");
				visit = false;
				break;

			default:
				System.out.println("Invalid choice, Please enter a number between 1 and 3");

			}

		}
		
		sc.close();

	}

}
