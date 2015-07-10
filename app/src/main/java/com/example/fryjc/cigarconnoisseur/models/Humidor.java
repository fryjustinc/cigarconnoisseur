package com.example.fryjc.cigarconnoisseur.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fryjc on 6/11/2015.
 */
public class Humidor {
    public List<CigarHolder> getmCigarsOwned() {
        return mCigarsOwned;
    }

    public void setmCigarsOwned(List<CigarHolder> mCigarsOwned) {
        this.mCigarsOwned = mCigarsOwned;
    }

    public List<CigarHolder> getmCigarsSmoked() {
        return mCigarsSmoked;
    }

    public void setmCigarsSmoked(List<CigarHolder> mCigarsSmoked) {
        this.mCigarsSmoked = mCigarsSmoked;
    }

    private List<CigarHolder> mCigarsOwned;
    private List<CigarHolder> mCigarsSmoked;
    public Humidor() {
        mCigarsOwned = new ArrayList<CigarHolder>();
        mCigarsSmoked = new ArrayList<CigarHolder>();

    }
    public Humidor(List<CigarHolder> cigarsOwned, List<CigarHolder> cigarsSmoked){
        mCigarsOwned=cigarsOwned;
        mCigarsSmoked=cigarsSmoked;
    }
    public void makeHolder(){
        CigarHolder placeHolder = new CigarHolder();
        placeHolder.setDealer("holder");
        mCigarsOwned.add(placeHolder);
        mCigarsSmoked.add(placeHolder);

    }

}
