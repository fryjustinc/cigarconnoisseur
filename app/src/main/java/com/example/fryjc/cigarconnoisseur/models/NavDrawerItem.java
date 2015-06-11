package com.example.fryjc.cigarconnoisseur.models;

/**
 * Created by fryjc on 5/27/2015.
 */
public class NavDrawerItem {
    private String mTitle;


    public NavDrawerItem(){}

    public NavDrawerItem(String title){
        this.mTitle = title;
    }

    public String getTitle(){
        return this.mTitle;
    }


    public void setTitle(String title){
        this.mTitle = title;
    }


}