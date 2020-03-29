package com.skilldistillery.foodtruck;

import java.util.Scanner;
import java.io.IOException;

public class FoodTruckApplication {
	Scanner input = new Scanner(System.in);
	int MAX_FT = 5;
	private FoodTruck daFoodTruck[] = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApplication ftApp = new FoodTruckApplication();
		ftApp.MakeMeAFoodTruckBaby();
//		ftApp.showMeStats();
//		ftApp.whyBeAverage();
//		ftApp.superStar();
		ftApp.makeMenu();
	}

	public void MakeMeAFoodTruckBaby() {
		for (int i = 0; i < daFoodTruck.length; i++) {
			System.out.println("\n* * * * TYPE quit when asked for Food Truck's name to exit * * * * ");
			System.out.println("What is the name for your new mobile culinary platform #" + (i + 1)
					+ " (i.e. Food Truck's name)??? : \n\t");
			String nomDeGuerre = input.nextLine();
			nomDeGuerre = nomDeGuerre.toLowerCase();

			if (!nomDeGuerre.equals("quit")) {
				System.out.println("In one word describe your cuisine (i.e. Mexican, Vietmanese, Korean): \n\t");
				String nomNomNom = input.nextLine();

				System.out.println("How much is " + nomDeGuerre + "'s" + " " + nomNomNom
						+ " Food Truck liked??? (i.e. break all those subjective feelings down to a one to five rating)\t\n");
				double showMeYourStars = input.nextDouble();

				if (showMeYourStars < 0) {
					System.out.println(
							"With a " + showMeYourStars + " rating, Have you thought about learning to code?\n");

				} else if (showMeYourStars > 5) {
					System.out.println("WOW WOW WOW A " + showMeYourStars
							+ " rating!!! Obviously your are a SUPERSTAR with your own rating system\n");
				}
				daFoodTruck[i] = new FoodTruck(nomDeGuerre, nomNomNom, showMeYourStars);
				input.nextLine();

			} else {
				System.out.println(
						"* * * * * * * * You have choosen to quit Food Truck creation and continue * * * * * * * *\n");
//				 would you like to fill out a comment card to assist us to be a better food truck?
				break;
			}

		}
	}

//  Check on what show food trucks mean;
	public void showMeStats() {
		for (FoodTruck foodTruck : daFoodTruck) {
			if (foodTruck != null) {

				System.out.println("\tUnique ID:" + foodTruck.getYouAreUnique());

				System.out.println("\tNAME: " + foodTruck.getNomDeGuerre());

				System.out.println("\tCUISINE: " + foodTruck.getNomNomNom());

				System.out.println("\tRATING: " + foodTruck.getShowMeYourStars() + "\n");

				System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_\n\n");

			}
		}
	}

	public void whyBeAverage() {

		Double output = 0.0;
		int counter = 0;
		for (int i = 0; i < daFoodTruck.length; i++) {
//			Double x = (double) counter;
			if (daFoodTruck[i] != null) {
				counter++;
				output = output + daFoodTruck[i].getShowMeYourStars();
			}
		}
		Double average = output / counter;
		System.out.printf("Average rating of the " + daFoodTruck.length + " Food Trucks is: %.2f", average);
		System.out.println("\n\n");
	}

	public void superStar() {
		double highScore = 0.0;
		String highReview = " ";
		double highComp = 0.0;
		for (int j = 0; j < daFoodTruck.length; j++) {
			FoodTruck foodTruck = daFoodTruck[j];
			if (foodTruck != null) {
				highComp = foodTruck.getShowMeYourStars();
				if (highComp > highScore) {
					highScore = highComp;
					highReview = foodTruck.getNomDeGuerre();
				}
			}
		}
		System.out.println("The Highest Reviewed Food Truck is : " + highReview);
	}

	public void makeMenu() {
//		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("**                                                 **");
			System.out.println("**    1) List all existing Food Trucks             **");
			System.out.println("**                                                 **");
			System.out.println("**    2) See the average rating of Food Trucks     **");
			System.out.println("**                                                 **");
			System.out.println("**    3) Display the highest-rated Food Trucks     **");
			System.out.println("**                                                 **");
			System.out.println("**    4) Quit the program                          **");
			System.out.println("**                                                 **");
			System.out.println("*****************************************************");

			int menuChoice = input.nextInt();
			switch (menuChoice) {
			case 1:
				showMeStats();
				continue;
			case 2:
				whyBeAverage();
				continue;
			case 3:
				superStar();
				continue;
			default:
			
				System.out.println("\n\n\n*****************************************************************");
				System.out.println("**                                                             **");
				System.out.println("**      Thank you for engaging with Food Truck Application!!   **");
				System.out.println("**                                                             **");
				System.out.println("**                    	GOODBYE!!                              **");
				System.out.println("**                                                             **");
				System.out.println("*****************************************************************");
				input.close();

				System.exit(0);
			}
		}
	}
}
