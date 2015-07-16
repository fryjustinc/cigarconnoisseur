package com.example.fryjc.cigarconnoisseur.ui.main;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.fryjc.cigarconnoisseur.models.User;
import com.example.fryjc.cigarconnoisseur.ui.brand.CigarDatabaseFragment;
import com.example.fryjc.cigarconnoisseur.ui.humidor.HumidorFragment;
import com.example.fryjc.cigarconnoisseur.ui.logout.LogoutFragment;
import com.example.fryjc.cigarconnoisseur.R;
import com.example.fryjc.cigarconnoisseur.ui.brand.adapters.BrandListAdapter;
import com.example.fryjc.cigarconnoisseur.ui.humidor.adapters.CigarListAdapter;
import com.example.fryjc.cigarconnoisseur.layoutlibrary.FloatingActionButton;
import com.example.fryjc.cigarconnoisseur.models.CigarHolder;
import com.firebase.client.Firebase;

/**
 * Created by fryjc on 5/27/2015.
 */
public class MainActivity extends ActionBarActivity implements FloatingActionButton.OnCheckedChangeListener, RelativeLayout.OnClickListener, BrandListAdapter.iCall, CigarListAdapter.iCall {
    private FragmentNavigationDrawer dlDrawer;
    private FrameLayout mFrame;
    private RelativeLayout logoutLayout;
    private UserViewModel mUserVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_main);
        Intent intent = getIntent();
        String authUID = intent.getStringExtra("authUID");
        this.mUserVM = new UserViewModel(this);
        mUserVM.LoadUserData(authUID);
        Firebase.setAndroidContext(this);
        Firebase firebase = new Firebase("https://glaring-heat-6164.firebaseio.com/");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        logoutLayout = (RelativeLayout) findViewById(R.id.logout_layout);
        logoutLayout.setOnClickListener(this);
        dlDrawer = (FragmentNavigationDrawer) findViewById(R.id.drawer_layout);
        dlDrawer.setupDrawerConfiguration((RelativeLayout)findViewById(R.id.drawer_wrap),(ListView) findViewById(R.id.lvDrawer), actionBar
        );
        dlDrawer.addNavItem("Humidor", R.drawable.humidor_icon, "My Humidor", HumidorFragment.class);
        dlDrawer.addNavItem("Cigar Database",R.drawable.database_icon, "Cigar Database", CigarDatabaseFragment.class);
        dlDrawer.addNavItem("Activity",R.drawable.ic_action_edit, "Activity", CigarDatabaseFragment.class);
        dlDrawer.addNavItem("Profile",R.drawable.ic_action_android, "Profile", CigarDatabaseFragment.class);
        dlDrawer.addNavItem("Local Places",R.drawable.ic_action_location, "Local Places", CigarDatabaseFragment.class);
        dlDrawer.addNavItem("Smoke One",R.drawable.ic_action_emo_cool, "Smoke One", CigarDatabaseFragment.class);

        if (savedInstanceState == null) {
            dlDrawer.selectDrawerItem(0);
        }
    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (dlDrawer.isDrawerOpen()) {
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (dlDrawer.getDrawerToggle().onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        dlDrawer.getDrawerToggle().syncState();
    }

    public UserViewModel getmUserVM() {
        return mUserVM;
    }

    public void setmUserVM(UserViewModel mUserVM) {
        this.mUserVM = mUserVM;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        dlDrawer.getDrawerToggle().onConfigurationChanged(newConfig);
    }


    @Override
    public void onCheckedChanged(FloatingActionButton fabView, boolean isChecked) {
        android.support.v4.app.Fragment humidorFragment = getSupportFragmentManager().findFragmentByTag("HUMIDOR");
        HumidorFragment tempFrag = (HumidorFragment) humidorFragment;
        tempFrag.checked(fabView, isChecked);
    }

    @Override
    public void onClick(View v) {
        logoutLayout.setBackgroundResource(R.drawable.list_item_bg_pressed);
        DialogFragment newFragment = new LogoutFragment();
        newFragment.show(this.getSupportFragmentManager(), "logout");
    }
    public void resetLogOut(){
        logoutLayout.setBackgroundResource(R.drawable.list_item_bg_normal);
    }

    @Override
    public void onClick(String brand) {

    }

    @Override
    public void onClick(CigarHolder cigarHolder) {

    }
}