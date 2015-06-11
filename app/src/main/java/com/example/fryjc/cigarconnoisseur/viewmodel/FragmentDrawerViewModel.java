package com.example.fryjc.cigarconnoisseur.viewmodel;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by fryjc on 5/29/2015.
 */
public class FragmentDrawerViewModel {
    private Context mContext;
    RequestQueue mQueue;
    //I think a StringRequest is more convenient in your case cause you can
    //make a new JSONArray straight from the String

    public FragmentDrawerViewModel(Context myContext){
        mContext = myContext;
        mQueue = Volley.newRequestQueue(mContext);
    }



    //This will send the request



}
