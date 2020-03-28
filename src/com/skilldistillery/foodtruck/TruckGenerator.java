package com.skilldistillery.foodtruck;

import java.util.Arrays;

public class TruckGenerator {
	private String nomDeGuerre;
	private String nomNomNom;
	private int showMeYourStars;
	private int iAmANumber = 0;
	private static int youAreUnique = 1;
	private TruckGenerator daFoodTruck[] = new TruckGenerator[5];
	private int tickTickBoom;

	
	
	public TruckGenerator(String nomDeGuerre, String nomNomNom, int showMeYourStars, int iAmANumber,
			TruckGenerator[] daFoodTruck, int tickTickBoom) {
		super();
		this.nomDeGuerre = nomDeGuerre;
		this.nomNomNom = nomNomNom;
		this.showMeYourStars = showMeYourStars;
		this.iAmANumber = iAmANumber;
		this.daFoodTruck = daFoodTruck;
		this.tickTickBoom = tickTickBoom;
	}
	public String getNomDeGuerre() {
		return nomDeGuerre;
	}
	public void setNomDeGuerre(String nomDeGuerre) {
		this.nomDeGuerre = nomDeGuerre;
	}
	public String getNomNomNom() {
		return nomNomNom;
	}
	public void setNomNomNom(String nomNomNom) {
		this.nomNomNom = nomNomNom;
	}
	public int getShowMeYourStars() {
		return showMeYourStars;
	}
	public void setShowMeYourStars(int showMeYourStars) {
		this.showMeYourStars = showMeYourStars;
	}
	public int getiAmANumber() {
		return iAmANumber;
	}
	public void setiAmANumber(int iAmANumber) {
		this.iAmANumber = iAmANumber;
	}
	public static int getYouAreUnique() {
		return youAreUnique;
	}
	public static void setYouAreUnique(int youAreUnique) {
		TruckGenerator.youAreUnique = youAreUnique;
	}
	public TruckGenerator[] getDaFoodTruck() {
		return daFoodTruck;
	}
	public void setDaFoodTruck(TruckGenerator[] daFoodTruck) {
		this.daFoodTruck = daFoodTruck;
	}
	public int getTickTickBoom() {
		return tickTickBoom;
	}
	public void setTickTickBoom(int tickTickBoom) {
		this.tickTickBoom = tickTickBoom;
	}


	@Override
	public String toString() {
		return "TruckGenerator [nomDeGuerre=" + nomDeGuerre + ", nomNomNom=" + nomNomNom + ", showMeYourStars="
				+ showMeYourStars + ", iAmANumber=" + iAmANumber + ", daFoodTruck=" + Arrays.toString(daFoodTruck)
				+ ", tickTickBoom=" + tickTickBoom + "]";
	}
}