package com.example.fryjc.cigarconnoisseur.ui.main;

/**
 * Created by fryjc on 5/27/2015.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.fryjc.cigarconnoisseur.R;
import com.example.fryjc.cigarconnoisseur.models.NavDrawerItem;
import com.example.fryjc.cigarconnoisseur.ui.brand.CigarDBViewModel;
import com.google.gson.Gson;

import java.util.ArrayList;

public class FragmentNavigationDrawer extends DrawerLayout{
    private ActionBarDrawerToggle drawerToggle;
    private RelativeLayout drawerWrap;
    private ListView lvDrawer;
    private ActionBar actionbar;
    private NavDrawerListAdapter drawerAdapter;
    private ArrayList<NavDrawerItem> navDrawerItems;
    private ArrayList<FragmentNavItem> drawerNavItems;
    private int drawerContainerRes;
    private CigarDBViewModel mViewModel;
    public static final String cigarDBKey = "123";
    public static final String humidorKey = "456";
    private ListView mLogout;

    public FragmentNavigationDrawer(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public FragmentNavigationDrawer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FragmentNavigationDrawer(Context context) {
        super(context);
    }

    public void setupDrawerConfiguration(RelativeLayout drawerLayout, ListView drawerList, ActionBar drawerActionBar) {
        drawerNavItems = new ArrayList<FragmentNavigationDrawer.FragmentNavItem>();
        navDrawerItems = new ArrayList<NavDrawerItem>();
        drawerContainerRes = R.id.flContent;
        mViewModel = new CigarDBViewModel(getContext());
        lvDrawer = drawerList;
        drawerWrap = drawerLayout;
        actionbar = drawerActionBar;
        lvDrawer.setOnItemClickListener(new FragmentDrawerItemListener());
        drawerToggle = new ActionBarDrawerToggle(
                getActivity(),
                this,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        setDrawerListener(drawerToggle);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeButtonEnabled(true);
    }


    public void addNavItem(String navTitle,int navPic, String windowTitle, Class<? extends Fragment> fragmentClass) {
        navDrawerItems.add(new NavDrawerItem(navTitle,navPic));
        drawerAdapter = new NavDrawerListAdapter(getActivity(),navDrawerItems);
        lvDrawer.setAdapter(drawerAdapter);
        drawerNavItems.add(new FragmentNavItem(windowTitle, fragmentClass));
    }

    /**
     * Swaps fragments in the main content view
     */
    public void selectDrawerItem(final int position) {
        final FragmentNavItem navItem = drawerNavItems.get(position);
        String tag = "";
        switch(position){
            case 0: tag = "HUMIDOR";
                break;
            case 1: tag = "DATABASE";
                break;
        }
        Fragment fragment = null;
        try {
            fragment = navItem.getFragmentClass().newInstance();

            final Fragment finalFragment = fragment;
            final String finalTag = tag;
            mViewModel.getCigarDB(new CigarDBViewModel.IReturnListener() {
                                      @Override
                                      public void onReturn(ArrayList<Object> brands) {
                                          Bundle args = navItem.getFragmentArgs();
                                          if (args != null) {
                                              finalFragment.setArguments(args);
                                          }

                                          if (args == null) {
                                              args = new Bundle();
                                          }
                                          Gson gson = new Gson();
                                          String serialized = gson.toJson(brands);
                                          args.putString(cigarDBKey, serialized);
                                          finalFragment.setArguments(args);
                                          FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                                          fragmentManager.beginTransaction().replace(drawerContainerRes, finalFragment, finalTag).commit();
                                      }
                                  }
            );
                    lvDrawer.setItemChecked(position, true);
                    setTitle(navItem.getTitle());



        } catch (Exception e) {
            e.printStackTrace();
        }


        closeDrawer(drawerWrap);
    }


    public ActionBarDrawerToggle getDrawerToggle() {
        return drawerToggle;
    }


    private FragmentActivity getActivity() {
        return (FragmentActivity) getContext();
    }

    private ActionBar getSupportActionBar() {
        return ((ActionBarActivity) getActivity()).getSupportActionBar();
    }

    private void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
    }

    private class FragmentDrawerItemListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectDrawerItem(position);
        }
    }


    private class FragmentNavItem {
        private Class<? extends Fragment> fragmentClass;
        private String title;
        private Bundle fragmentArgs;

        public FragmentNavItem(String title, Class<? extends Fragment> fragmentClass) {
            this(title, fragmentClass, null);
        }

        public FragmentNavItem(String title, Class<? extends Fragment> fragmentClass,  Bundle args) {
            this.fragmentClass = fragmentClass;
            this.fragmentArgs = args;
            this.title = title;
        }

        public Class<? extends Fragment> getFragmentClass() {
            return fragmentClass;
        }

        public String getTitle() {
            return title;
        }

        public Bundle getFragmentArgs() {
            return fragmentArgs;
        }
    }



    public boolean isDrawerOpen() {
        return isDrawerOpen(drawerWrap);
    }

}
