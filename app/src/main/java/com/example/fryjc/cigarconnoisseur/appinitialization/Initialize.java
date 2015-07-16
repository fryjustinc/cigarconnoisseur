
package com.example.fryjc.cigarconnoisseur.appinitialization;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.firebase.client.AuthData;
import com.firebase.client.Firebase;


public class Initialize extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        FacebookSdk.sdkInitialize(this);
    }

}