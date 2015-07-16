package com.example.fryjc.cigarconnoisseur.ui;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by fryjc on 6/11/2015.
 */
public class CigarDBViewModel {

    private Context mContext;
    private RequestQueue mQueue;
    public ArrayList<Object> mCigarBrands;
    //I think a StringRequest is more convenient in your case cause you can
    //make a new JSONArray straight from the String

    public CigarDBViewModel(Context myContext){
        mContext = myContext;
        mQueue = Volley.newRequestQueue(mContext);

    }
    public void getCigarDB(final IReturnListener listener) {
        Firebase fire = new Firebase("https://glaring-heat-6164.firebaseio.com/brands");
        fire.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                mCigarBrands = (ArrayList<Object>) snapshot.getValue();
                listener.onReturn(mCigarBrands);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });

    }
    public interface IReturnListener{
        void onReturn(ArrayList<Object> mCigarBrands);
    }
}
