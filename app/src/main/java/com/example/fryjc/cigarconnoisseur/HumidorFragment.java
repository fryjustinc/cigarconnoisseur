package com.example.fryjc.cigarconnoisseur;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ViewAnimator;

import com.example.fryjc.cigarconnoisseur.adapters.CustomSpinnerAdapter;
import com.example.fryjc.cigarconnoisseur.adapters.ViewPagerAdapter;
import com.example.fryjc.cigarconnoisseur.floatingactionbuttonbasic.FloatingActionButton;
import com.example.fryjc.cigarconnoisseur.floatingactionbuttonbasic.FloatingActionButtonBasicFragment;

import java.util.ArrayList;

/**
 * Created by fryjc on 5/30/2015.
 */
public class HumidorFragment extends Fragment implements Button.OnClickListener{
    RecyclerView mRecycleView;
    private ViewAnimator mAnimate;
    private Button mButton;
    private Spinner spinner_sort;
    private Spinner spinner_type;
    Animation anim1;
    Animation anim2;
    private FloatingActionButtonBasicFragment mFragment;
    private View mRoot;
    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"   Cigars in my humidor   ","  Cigars I have smoked  "};
    int Numboftabs =2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.humidor, container, false);
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        mFragment = new FloatingActionButtonBasicFragment();


        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapter(getActivity().getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) mRoot.findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) mRoot.findViewById(R.id.tabs);
        // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer(){

                                       @Override
                                       public int getIndicatorColor(int position) {
                                           return getResources().getColor(R.color.accent);
                                       }

                                       @Override
                                       public int getDividerColor(int position) {
                                           return getResources().getColor(R.color.tab);
                                       }
                                   }
        );

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
        transaction.replace(R.id.action_button_fragment, mFragment);
        transaction.commit();
        mAnimate = (ViewAnimator) mRoot.findViewById(R.id.cigaradd);
        mAnimate.setInAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.abc_grow_fade_in_from_bottom));
        mAnimate.setOutAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.abc_shrink_fade_out_from_bottom));
        mButton = (Button)mRoot.findViewById(R.id.toggle);
        mButton.setOnClickListener(this);
        return mRoot;
        }

    @Override
    public void onCreateOptionsMenu(
            Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.humidor_menu, menu);
        MenuItem item = menu.findItem(R.id.menuSort);
        spinner_sort = (Spinner) MenuItemCompat.getActionView(item);
        ArrayList<String> sortList = new ArrayList<String>();
        sortList.add("Sort By: Name");
        sortList.add("Sort By: Value");
        sortList.add("Sort By: Age");
        sortList.add("Sort By: Rating");

        CustomSpinnerAdapter spinSortAdapter = new CustomSpinnerAdapter(
                getActivity(), sortList);


        spinner_sort.setAdapter(spinSortAdapter);


        spinner_sort.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                String item = adapter.getItemAtPosition(position).toString();

                Toast.makeText(getActivity(), "Selected  : " + item,
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });



    }




    public void checked(FloatingActionButton fabView, boolean isChecked) {
        final float conversion =  getResources().getDisplayMetrics().density;
        if(isChecked){
            AnimatorSet animView = new AnimatorSet();
            ValueAnimator tran = ObjectAnimator.ofFloat(mAnimate,"y", mAnimate.getY(),mAnimate.getY() - 345 * conversion);
            tran.setDuration(300);
            tran.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator fabRot = ObjectAnimator.ofFloat(fabView,"rotation", 0f, 135f);
            fabRot.setDuration(400);
            ValueAnimator fabAlpha = ObjectAnimator.ofFloat(fabView, "alpha", 1f, 0f);
            fabAlpha.setDuration(100);
            ValueAnimator fabTran = ObjectAnimator.ofFloat(fabView, "y", fabView.getY(), fabView.getY() - 16 * conversion);
            fabTran.setDuration(200);
            animView.play(fabRot).before(fabAlpha);
            animView.play(fabAlpha).with(fabTran);
            animView.play(fabAlpha).with(tran);
            mAnimate.setDisplayedChild(1);
            animView.start();
        } else{
            AnimatorSet animOut = new AnimatorSet();
            ValueAnimator fabRot2 = ObjectAnimator.ofFloat(fabView,"rotation", 135f, 0f);
            fabRot2.setDuration(200);
            ValueAnimator fabAlpha2 = ObjectAnimator.ofFloat(fabView, "alpha", 0f, 1f);
            fabAlpha2.setDuration(300);
            ValueAnimator fabTran2 = ObjectAnimator.ofFloat(fabView, "y", fabView.getY(), fabView.getY() + 16 * conversion);
            fabTran2.setDuration(200);
            ValueAnimator tran2 = ObjectAnimator.ofFloat(mAnimate,"y", mAnimate.getY(),mAnimate.getY() + 345 * conversion);
            tran2.setDuration(300);
            animOut.play(tran2).before(fabAlpha2);
            animOut.play(fabAlpha2).with(fabTran2);
            animOut.play(fabAlpha2).with(fabRot2);
            animOut.start();
            mAnimate.setDisplayedChild(0);
        }

    }

    @Override
    public void onClick(View v) {
        mFragment.toggleButton();
    }
}