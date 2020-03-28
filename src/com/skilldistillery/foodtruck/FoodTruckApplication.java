package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {
	Scanner input = new Scanner(System.in);
	int MAX_FT =5;
	private FoodTruck daFoodTruck[] = new FoodTruck[5];

	public static void main(String[] args) {	
		FoodTruckApplication ftApp = new FoodTruckApplication();
		ftApp.MakeMeAFoodTruckBaby();
	}

	
	public void MakeMeAFoodTruckBaby(){
	for (int i = 0; i < daFoodTruck.length; i++) {
		
		System.out.println("What is the name for your new mobile culinary platform(i.e. Food Truck's name)??? : \t");
		String nomDeGuerre = input.nextLine();
		
		nomDeGuerre = nomDeGuerre.toLowerCase();
		if (nomDeGuerre.equals("quit")) {
			System.out.println("* * * * * * * * You have choosen to quit * * * * * * * *");
			break;
		}
		
		System.out.println("In one word describe your cuisine (i.e. Mexican, Vietmanese, Korean): \t");
		String nomNomNom = input.nextLine();
		
		System.out.println("How much is " + nomDeGuerre + "'s" + " " + nomNomNom + " Food Truck liked??? (i.e. break all those subjective feelings down to a one to five rating)\t" );
		double showMeYourStars = input.nextDouble();
		
		daFoodTruck[i] = new FoodTruck(nomDeGuerre, nomNomNom, showMeYourStars);
//		System.out.println(daFoodTruck[i]);
		
	}
		
		
		
		
	}

//	@Override
//	public String toString() {
//		return "FoodTruckApplication [input=" + input + ", MAX_FT=" + MAX_FT + ", daFoodTruck="
//				+ Arrays.toString(daFoodTruck) + "]";
//	}
}
