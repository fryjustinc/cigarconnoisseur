package com.example.fryjc.cigarconnoisseur;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ViewAnimator;

import com.example.fryjc.cigarconnoisseur.floatingactionbuttonbasic.FloatingActionButton;
import com.example.fryjc.cigarconnoisseur.floatingactionbuttonbasic.FloatingActionButtonBasicFragment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by fryjc on 5/30/2015.
 */
public class HumidorFragment extends Fragment implements Button.OnClickListener{
    RecyclerView mRecycleView;
    ViewAnimator mAnimate;
    Button mButton;
    Animation anim1;
    Animation anim2;
    FloatingActionButtonBasicFragment mFragment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.humidor, container, false);
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        mFragment = new FloatingActionButtonBasicFragment();
        transaction.replace(R.id.action_button_fragment,mFragment);
        transaction.commit();
        mAnimate = (ViewAnimator) root.findViewById(R.id.cigaradd);
        mAnimate.setInAnimation(AnimationUtils.loadAnimation(getActivity(),R.anim.abc_grow_fade_in_from_bottom));
        mAnimate.setOutAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.abc_shrink_fade_out_from_bottom));
        mButton = (Button)root.findViewById(R.id.toggle);
        mButton.setOnClickListener(this);
        return root;

    }


    public void checked(FloatingActionButton fabView, boolean isChecked) {
        if(isChecked){
            AnimatorSet animView = new AnimatorSet();
            ValueAnimator tran = ObjectAnimator.ofFloat(mAnimate,"y", mAnimate.getY(),mAnimate.getY()-1040f);
            tran.setDuration(300);
            tran.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator fabRot = ObjectAnimator.ofFloat(fabView,"rotation", 0f, 135f);
            fabRot.setDuration(400);
            ValueAnimator fabAlpha = ObjectAnimator.ofFloat(fabView, "alpha", 1f, 0f);
            fabAlpha.setDuration(200);
            ValueAnimator fabTran = ObjectAnimator.ofFloat(fabView, "y", fabView.getY(), fabView.getY() - 75f);
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
            fabAlpha2.setDuration(200);
            ValueAnimator fabTran2 = ObjectAnimator.ofFloat(fabView, "y", fabView.getY(), fabView.getY() + 75f);
            fabTran2.setDuration(200);
            ValueAnimator tran2 = ObjectAnimator.ofFloat(mAnimate,"y", mAnimate.getY(),mAnimate.getY()+1040f);
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