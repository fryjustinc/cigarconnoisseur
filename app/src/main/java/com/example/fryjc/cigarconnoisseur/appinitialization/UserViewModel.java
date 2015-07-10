package com.example.fryjc.cigarconnoisseur.appinitialization;

import android.content.Context;
import android.provider.ContactsContract;

import com.example.fryjc.cigarconnoisseur.models.User;
import com.firebase.client.AuthData;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;



/**
 * Created by fryjc on 7/9/2015.
 */
public class UserViewModel{
    private User mUser;
    private Firebase res;
    private boolean mLoggedIn = false;
    private DataSnapshot test;
    public UserViewModel(){
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
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        if(test == null){
            usersRef.setValue(mUser.getAuthData().getUid());
            usersRef.child(mUser.getAuthData().getUid()).setValue(mUser);
        } else{
        }

    }

}
