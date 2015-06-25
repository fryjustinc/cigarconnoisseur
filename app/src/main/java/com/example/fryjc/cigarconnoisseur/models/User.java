package com.example.fryjc.cigarconnoisseur.models;

import java.util.ArrayList;

/**
 * Created by fryjc on 6/7/2015.
 */
public class User {
    private String mUsername;
    private String mEmail;
    private Humidor mHumidor;
    private ArrayList<PMessage> mMessages;
    private ArrayList<RatingComment> mComments;
    private ArrayList<CigarRating> mRatings;

    public User(String mUsername, String mEmail, Humidor mHumidor, ArrayList<PMessage> mMessages, ArrayList<RatingComment> mComments, ArrayList<CigarRating> mRatings) {

        this.mUsername = mUsername;
        this.mEmail = mEmail;
        this.mHumidor = mHumidor;
        this.mMessages = mMessages;
        this.mComments = mComments;
        this.mRatings = mRatings;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public Humidor getmHumidor() {
        return mHumidor;
    }

    public void setmHumidor(Humidor mHumidor) {
        this.mHumidor = mHumidor;
    }

    public ArrayList<PMessage> getmMessages() {
        return mMessages;
    }

    public void setmMessages(ArrayList<PMessage> mMessages) {
        this.mMessages = mMessages;
    }

    public ArrayList<RatingComment> getmComments() {
        return mComments;
    }

    public void setmComments(ArrayList<RatingComment> mComments) {
        this.mComments = mComments;
    }

    public ArrayList<CigarRating> getmRatings() {
        return mRatings;
    }

    public void setmRatings(ArrayList<CigarRating> mRatings) {
        this.mRatings = mRatings;
    }


}
