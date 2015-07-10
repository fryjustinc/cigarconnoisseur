
package com.example.fryjc.cigarconnoisseur.appinitialization;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.firebase.client.Firebase;

/**
 * Initialize Firebase with the application context. This must happen before the client is used.
 *
 * @author mimming
 * @since 12/17/14
 */
public class Initialize extends Application {
    public static UserViewModel mUserViewModel;
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        FacebookSdk.sdkInitialize(this);
        mUserViewModel = new UserViewModel();
    }
}