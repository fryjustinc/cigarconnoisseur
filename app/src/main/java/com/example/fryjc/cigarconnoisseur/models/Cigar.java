package com.example.fryjc.cigarconnoisseur.models;

import com.example.fryjc.cigarconnoisseur.enums.Country;
import com.example.fryjc.cigarconnoisseur.enums.Filler;
import com.example.fryjc.cigarconnoisseur.enums.Strength;
import com.example.fryjc.cigarconnoisseur.enums.Wrapper;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class Cigar {
	@SerializedName("brand")
	public String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@SerializedName("name")
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getRingGauge() {
		return ringGauge;
	}
	public void setRingGauge(String ringGauge) {
		this.ringGauge = ringGauge;
	}
	public ArrayList<Country> getCountry() {
		return country;
	}
	public void setCountry(ArrayList<Country> country) {
		this.country = country;
	}
	public ArrayList<Filler> getFiller() {
		return filler;
	}
	public void setFiller(ArrayList<Filler> filler) {
		this.filler = filler;
	}
	public ArrayList<Wrapper
			> getWrapper() {
		return wrapper;
	}
	public void setWrapper(ArrayList<Wrapper> wrapper) {
		this.wrapper = wrapper;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Strength getStrength() {
		return strength;
	}
	public void setStrength(Strength strength) {
		this.strength = strength;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@SerializedName("length")
	public String length;
	@SerializedName("ringGauge")
	private String ringGauge;
	@SerializedName("country")
	private ArrayList<Country> country;
	@SerializedName("filler")
	private ArrayList<Filler> filler;
	@SerializedName("wrapper")
	private ArrayList<Wrapper> wrapper;
	@SerializedName("color")
	private String color;
	@SerializedName("strength")
	private Strength strength;
	@SerializedName("rating")
	private String rating;
	public Cigar(String pbrand, String pname, String plength, String pringGauge, ArrayList<Country> pcountry,
			ArrayList<Filler> pfiller, ArrayList<Wrapper> pwrapper, String pcolor, Strength pstrength, String prating){
		brand = pbrand;
		name = pname;
		length = plength;
		ringGauge = pringGauge;
		country = pcountry;
		filler= pfiller;
		wrapper=pwrapper;
		color = pcolor;
		strength = pstrength;
		rating = prating;
	}
	public Cigar(){
		brand = "";
		name = "";
		length = "0";
		ringGauge = "0";
		country = new ArrayList<Country>();
		filler = new ArrayList<Filler>();
		wrapper = new ArrayList<Wrapper>();
		color = "";
	}

}
