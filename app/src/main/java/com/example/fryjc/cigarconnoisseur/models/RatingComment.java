package com.example.fryjc.cigarconnoisseur.models;

/**
 * Created by fryjc on 6/17/2015.
 */
public class RatingComment {
    private CigarRating mRating;
    private String mUser;
    private String mComment;

    public RatingComment(CigarRating mRating, String mUser, String mComment) {

        this.mRating = mRating;
        this.mUser = mUser;
        this.mComment = mComment;
    }

    public CigarRating getmRating() {
        return mRating;
    }

    public void setmRating(CigarRating mRating) {
        this.mRating = mRating;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmComment() {
        return mComment;
    }

    public void setmComment(String mComment) {
        this.mComment = mComment;
    }


}
