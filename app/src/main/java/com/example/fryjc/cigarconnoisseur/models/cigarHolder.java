package com.example.fryjc.cigarconnoisseur.models;

import android.support.annotation.DrawableRes;

import com.example.fryjc.cigarconnoisseur.models.Cigar;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fryjc on 6/7/2015.
 */
public class CigarHolder {


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    private String age;
    private String personalRating;
    private String ratingDescription;
    private String dealer;
    private String notes;
    private String amountOwned;
    private String amountSmoked;
    private String mSmallImageURL;

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    private int mImage;
    public CigarHolder(String age, String amountOwned, String amountSmoked, String personalRating, String ratingDescription, String dealer, String notes, String purchased, Cigar cigar,int image) {
        this.age = age;
        this.amountOwned = amountOwned;
        this.amountSmoked = amountSmoked;
        this.personalRating = personalRating;
        this.ratingDescription = ratingDescription;
        this.dealer = dealer;
        this.notes = notes;
        this.purchased = purchased;
        this.cigar = cigar;
        this.mImage=image;
    }

    public String getmSmallImageURL() {
        return mSmallImageURL;
    }

    public void setCigar(Cigar cigar) {
        this.cigar = cigar;
    }

    public void setAmountOwned(String amountOwned) {
        this.amountOwned = amountOwned;
    }

    public void setAmountSmoked(String amountSmoked) {
        this.amountSmoked = amountSmoked;
    }

    public void setPersonalRating(String personalRating) {
        this.personalRating = personalRating;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }

    private String purchased;

    public String getAmountOwned() {
        return amountOwned;
    }

    public String getAmountSmoked() {
        return amountSmoked;
    }

    public String getPersonalRating() {
        return personalRating;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public String getDealer() {
        return dealer;
    }

    public String getNotes() {
        return notes;
    }

    public String getPurchased() {
        return purchased;
    }

    public Cigar getCigar() {
        return cigar;
    }

    private Cigar cigar;
    public CigarHolder(){

    }


}
