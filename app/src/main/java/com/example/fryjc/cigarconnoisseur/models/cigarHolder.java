package com.example.fryjc.cigarconnoisseur.models;

import com.example.fryjc.cigarconnoisseur.models.Cigar;
import com.google.gson.annotations.SerializedName;

import java.sql.Time;
import java.util.Date;

/**
 * Created by fryjc on 6/7/2015.
 */
public class cigarHolder {


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @SerializedName("age")
    private String age;
    @SerializedName("personalRating")
    private String personalRating;
    @SerializedName("ratingDescription")
    private String ratingDescription;
    @SerializedName("dealer")
    private String dealer;
    @SerializedName("notes")
    private String notes;
    @SerializedName("amountOwned")
    private String amountOwned;
    @SerializedName("amountSmoked")
    private String amountSmoked;
    @SerializedName("mSmallImageURL")
    private String mSmallImageURL;
    public cigarHolder(String age, String amountOwned, String amountSmoked, String personalRating, String ratingDescription, String dealer, String notes, String purchased, Cigar cigar) {
        this.age = age;
        this.amountOwned = amountOwned;
        this.amountSmoked = amountSmoked;
        this.personalRating = personalRating;
        this.ratingDescription = ratingDescription;
        this.dealer = dealer;
        this.notes = notes;
        this.purchased = purchased;
        this.cigar = cigar;
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

        @SerializedName("purchased")
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


}
