package com.example.fryjc.cigarconnoisseur.appinitialization;

import android.content.Context;
import android.provider.ContactsContract;

import com.example.fryjc.cigarconnoisseur.models.Cigar;
import com.example.fryjc.cigarconnoisseur.models.CigarHolder;
import com.example.fryjc.cigarconnoisseur.models.Humidor;
import com.example.fryjc.cigarconnoisseur.models.User;
import com.firebase.client.AuthData;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import org.dbasu.robomvvm.viewmodel.ViewModel;

import java.util.ArrayList;


/**
 * Created by fryjc on 7/9/2015.
 */
public class UserViewModel extends ViewModel{
    private User mUser;
    private Firebase res;
    private boolean mLoggedIn = false;
    private DataSnapshot test;
    public UserViewModel(Context context){
        super(context);
        res = new Firebase("https://glaring-heat-6164.firebaseio.com/");
    }
    public void LoginUser(AuthData authData){
        mUser = new User();
        mUser.setAuthData(authData);
        this.CheckIfNewUser();
        mLoggedIn = true;

    }

    public void CheckIfNewUser(){
        Firebase usersRef = new Firebase("https://glaring-heat-6164.firebaseio.com/Users");
        usersRef.child(mUser.getAuthData().getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                test = dataSnapshot;
                if(test == null){
                    res.child("Users").setValue(mUser.getAuthData().getUid());
                    res.child("Users").child(mUser.getAuthData().getUid()).setValue(mUser);
                } else{
                    Humidor userHumidor = new Humidor();
                    ArrayList<Object> ownedCigars = new ArrayList<Object>();
                    ArrayList<Object> smokedCigars = new ArrayList<Object>();
                    DataSnapshot owned = dataSnapshot.child("mHumidor").child("mCigarsOwned");
                    ownedCigars = (ArrayList<Object>) owned.getValue();
                    DataSnapshot smoked = dataSnapshot.child("mHumidor").child("mCigarsSmoked");
                    smokedCigars = (ArrayList<Object>) smoked.getValue();
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


    }

}
