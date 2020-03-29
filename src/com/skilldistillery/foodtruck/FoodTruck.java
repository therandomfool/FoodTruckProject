package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String nomDeGuerre;
	private String nomNomNom;
	private Double showMeYourStars;
	private int youAreUnique = 0;
	private static int iAmANumber = 1;

	public FoodTruck() {
		super();
		youAreUnique = iAmANumber++;

	}


	public FoodTruck(String nomDeGuerre, String nomNomNom, Double showMeYourStars) {
		this();
		this.nomDeGuerre = nomDeGuerre;
		this.nomNomNom = nomNomNom;
		this.showMeYourStars = showMeYourStars;
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


	public Double getShowMeYourStars() {
		return showMeYourStars;
	}


	public void setShowMeYourStars(Double showMeYourStars) {
		this.showMeYourStars = showMeYourStars;
	}


	public int getYouAreUnique() {
		return youAreUnique;
	}


	public void setYouAreUnique(int youAreUnique) {
		this.youAreUnique = youAreUnique;
	}


	@Override
	public String toString() {
		return "FoodTruck [nomDeGuerre=" + nomDeGuerre + ", nomNomNom=" + nomNomNom + ", showMeYourStars="
				+ showMeYourStars + ", youAreUnique=" + youAreUnique + "]";
	}
}