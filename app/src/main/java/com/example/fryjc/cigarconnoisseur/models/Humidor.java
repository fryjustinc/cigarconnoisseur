package com.example.fryjc.cigarconnoisseur.models;

import java.util.ArrayList;

/**
 * Created by fryjc on 6/11/2015.
 */
public class Humidor {
    public ArrayList<CigarHolder> getmCigarsOwned() {
        return mCigarsOwned;
    }

    public void setmCigarsOwned(ArrayList<CigarHolder> mCigarsOwned) {
        this.mCigarsOwned = mCigarsOwned;
    }

    public ArrayList<CigarHolder> getmCigarsSmoked() {
        return mCigarsSmoked;
    }

    public void setmCigarsSmoked(ArrayList<CigarHolder> mCigarsSmoked) {
        this.mCigarsSmoked = mCigarsSmoked;
    }

    private ArrayList<CigarHolder> mCigarsOwned;
    private ArrayList<CigarHolder> mCigarsSmoked;
    public Humidor() {
    }
    public Humidor(ArrayList<CigarHolder> cigarsOwned, ArrayList<CigarHolder> cigarsSmoked){
        mCigarsOwned=cigarsOwned;
        mCigarsSmoked=cigarsSmoked;
    }

}
