package com.example.fryjc.cigarconnoisseur;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.fryjc.cigarconnoisseur.floatingactionbuttonbasic.FloatingActionButton;
import com.example.fryjc.cigarconnoisseur.models.ContactCard;

/**
 * Created by fryjc on 5/27/2015.
 */
public class MainActivity extends ActionBarActivity implements FloatingActionButton.OnCheckedChangeListener{
    private FragmentNavigationDrawer dlDrawer;
    private FrameLayout mFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_main);
        mFrame = (FrameLayout) this.findViewById(R.id.popup);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();



        dlDrawer = (FragmentNavigationDrawer) findViewById(R.id.drawer_layout);
        dlDrawer.setupDrawerConfiguration((ListView) findViewById(R.id.lvDrawer), actionBar,
                R.layout.drawer_nav_item, R.id.flContent);
        dlDrawer.addNavItem("Humidor", "My Humidor", HumidorFragment.class);
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
        MenuInflater inflater = getMenuInflater();
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

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        dlDrawer.getDrawerToggle().onConfigurationChanged(newConfig);
    }


    @Override
    public void onCheckedChanged(FloatingActionButton fabView, boolean isChecked) {
        android.support.v4.app.Fragment humidorFragment = getSupportFragmentManager().findFragmentByTag("HUMIDOR");
        HumidorFragment tempFrag = (HumidorFragment) humidorFragment;
        tempFrag.checked(fabView,isChecked);
    }
}