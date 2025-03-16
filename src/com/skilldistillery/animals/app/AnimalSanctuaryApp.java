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
				
		AnimalSanctuaryApp app =  new AnimalSanctuaryApp();
		app.launchApp();
	}
	private void launchApp() {
		Scanner sc = new Scanner(System.in);
		
		boolean roundStart = true;

		

		Sanctuary sanctuary = new Sanctuary();
		// instantiate a Sanctuary
		
		Attendant attendant = new Attendant();
		// instantiate an ATTENDANT
		
		sanctuary.addAttendant(attendant);
		// Add attendant to sanctuary
		
		Animal[] animals = {new Duck() , new Cat(), new Cow()};
		String[] animalTypes = {"Duck", "Cat", "Cow"};
		
		
			for(int i = 0; i < animals.length; i++) {
				System.out.println("Enter the name for the " + animalTypes[i] + ": ");
				animals[i].setName(sc.nextLine());
				sanctuary.addAnimal(animals[i], i);
				
		// Create and add animals to sanctuary
		// Have sanctuary list animals
					
			}
			while(roundStart) {
				sanctuary.startRounds();
			// Tell Sanctuary to start attendant rounds
				if(attendant.endRounds()) {
					roundStart = false;
				}
			}
			
			System.out.println("All rounds are complete!");
			sc.close();
			
		}
			
}
		

