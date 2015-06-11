package com.example.fryjc.cigarconnoisseur.models;

import com.example.fryjc.cigarconnoisseur.enums.Country;
import com.example.fryjc.cigarconnoisseur.enums.Filler;
import com.example.fryjc.cigarconnoisseur.enums.Strength;
import com.example.fryjc.cigarconnoisseur.enums.Wrapper;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Enumeration;



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
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public int getRingGauge() {
		return ringGauge;
	}
	public void setRingGauge(int ringGauge) {
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
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@SerializedName("length")
	public String length;
	@SerializedName("ringGauge")
	public String ringGauge;
	public ArrayList<Country> country;
	public ArrayList<Filler> filler;
	public ArrayList<Wrapper> wrapper;
	public String color;
	public Strength strength;
	public float rating;
	public Cigar(String pbrand, String pname, float plength, int pringGauge, ArrayList<Country> pcountry,
			ArrayList<Filler> pfiller, ArrayList<Wrapper> pwrapper, String pcolor, Strength pstrength, float prating){
		brand = pbrand;
		name = pname;
		length = plength;
		ringGauge = pringGauge;
		country.addAll(pcountry);
		filler.addAll(pfiller); 
		wrapper.addAll(pwrapper);
		color = pcolor;
		strength = pstrength;
		rating = prating;
	}
	public Cigar(){
		brand = "";
		name = "";
		length = 0;
		ringGauge = 0;
		country = new ArrayList<Country>();
		filler = new ArrayList<Filler>();
		wrapper = new ArrayList<Wrapper>();
		color = "";
	}

}
