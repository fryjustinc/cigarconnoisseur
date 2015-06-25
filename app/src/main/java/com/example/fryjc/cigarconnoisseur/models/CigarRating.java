package com.example.fryjc.cigarconnoisseur.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by fryjc on 6/17/2015.
 */
public class CigarRating {
    private float mRatingValue;
    private String mUser;
    private ArrayList<RatingComment> mComments;

    public ArrayList<RatingComment> getmComments() {
        return mComments;
    }

    public void setmComments(ArrayList<RatingComment> mComments) {
        this.mComments = mComments;
    }

    public float getmRatingValue() {
        return mRatingValue;
    }

    public void setmRatingValue(float mRatingValue) {
        this.mRatingValue = mRatingValue;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmRatingDescription() {
        return mRatingDescription;
    }

    public void setmRatingDescription(String mRatingDescription) {
        this.mRatingDescription = mRatingDescription;
    }

    public String getmCigarName() {
        return mCigarName;
    }

    public void setmCigarName(String mCigarName) {
        this.mCigarName = mCigarName;
    }

    private String mRatingDescription;
    private String mCigarName;

    public CigarRating(float mRatingValue, String mUser, String mRatingDescription, String mCigarName) {
        this.mRatingValue = mRatingValue;
        this.mUser = mUser;
        this.mRatingDescription = mRatingDescription;
        this.mCigarName = mCigarName;
    }
}
