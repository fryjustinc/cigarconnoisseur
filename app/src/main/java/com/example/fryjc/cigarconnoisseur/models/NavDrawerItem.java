package com.example.fryjc.cigarconnoisseur.models;

/**
 * Created by fryjc on 5/27/2015.
 */
public class NavDrawerItem {
    private String mTitle;
    private int mSrc;

    public NavDrawerItem(){}

    public NavDrawerItem(String title, int src){
        this.mTitle = title;
        this.mSrc = src;
    }

    public String getTitle(){
        return this.mTitle;
    }
    public int getPic() {return this.mSrc;}


    public void setTitle(String title){
        this.mTitle = title;
    }


}