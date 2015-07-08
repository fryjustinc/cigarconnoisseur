package com.example.fryjc.cigarconnoisseur.network;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by fryjc on 7/8/2015.
 */
public class NetworkWrapper {
    protected DataSnapshot singleSnap;

    public DataSnapshot getSingleSnap() {
        return singleSnap;
    }

    public void setSingleSnap(DataSnapshot singleSnap) {
        this.singleSnap = singleSnap;
    }

    public Firebase Init(){
        Firebase ref = new Firebase("https://glaring-heat-6164.firebaseio.com/");
        return ref;
    }

    public DataSnapshot getSingleSnapshot(Firebase ref){
        DataSnapshot snap;

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                setSingleSnap(dataSnapshot);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });
        snap = getSingleSnap();
        return snap;
    }

}
