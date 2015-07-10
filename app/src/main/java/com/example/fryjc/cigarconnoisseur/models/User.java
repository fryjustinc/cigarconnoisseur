package com.example.fryjc.cigarconnoisseur.models;

import com.firebase.client.AuthData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fryjc on 6/7/2015.
 */
public class User {
    private AuthData authData;
    private Humidor mHumidor;
    private List<PMessage> mMessages;
    private List<RatingComment> mComments;
    private List<CigarRating> mRatings;
    public User() {
        mHumidor = new Humidor();
        mHumidor.makeHolder();
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

    public List<PMessage> getmMessages() {
        return mMessages;
    }

    public void setmMessages(List<PMessage> mMessages) {
        this.mMessages = mMessages;
    }

    public List<RatingComment> getmComments() {
        return mComments;
    }

    public void setmComments(List<RatingComment> mComments) {
        this.mComments = mComments;
    }

    public List<CigarRating> getmRatings() {
        return mRatings;
    }

    public void setmRatings(List<CigarRating> mRatings) {
        this.mRatings = mRatings;
    }


}
