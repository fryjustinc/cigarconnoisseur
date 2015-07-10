package com.example.fryjc.cigarconnoisseur.models;

import com.firebase.client.AuthData;

import java.util.ArrayList;

/**
 * Created by fryjc on 6/7/2015.
 */
public class User {
    private AuthData authData;
    private Humidor mHumidor;
    private ArrayList<PMessage> mMessages;
    private ArrayList<RatingComment> mComments;
    private ArrayList<CigarRating> mRatings;

    public User() {

    }

    public AuthData getAuthData() {
        return authData;
    }

    public void setAuthData(AuthData authData) {
        this.authData = authData;
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
