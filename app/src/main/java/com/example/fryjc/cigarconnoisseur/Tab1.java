package com.example.fryjc.cigarconnoisseur;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

import com.example.fryjc.cigarconnoisseur.adapters.BrandListAdapter;
import com.example.fryjc.cigarconnoisseur.adapters.CigarListAdapter;
import com.example.fryjc.cigarconnoisseur.enums.Country;
import com.example.fryjc.cigarconnoisseur.enums.Filler;
import com.example.fryjc.cigarconnoisseur.enums.Strength;
import com.example.fryjc.cigarconnoisseur.enums.Wrapper;
import com.example.fryjc.cigarconnoisseur.layoutlibrary.ObservableListView;
import com.example.fryjc.cigarconnoisseur.layoutlibrary.ObservableScrollViewCallbacks;
import com.example.fryjc.cigarconnoisseur.layoutlibrary.ScrollState;
import com.example.fryjc.cigarconnoisseur.layoutlibrary.ScrollUtils;
import com.example.fryjc.cigarconnoisseur.models.Cigar;
import com.example.fryjc.cigarconnoisseur.models.CigarHolder;
import com.nineoldandroids.view.ViewHelper;

import java.util.ArrayList;

public class Tab1 extends android.support.v4.app.Fragment implements ObservableScrollViewCallbacks {

    private View mRoot;
    private View mImageView;
    private View mToolbarView;
    private View mListBackgroundView;
    private ObservableListView mListView;
    private int mParallaxImageHeight;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.tab_1, container, false);


        mImageView = mRoot.findViewById(R.id.imageHumidor);

        mParallaxImageHeight = getResources().getDimensionPixelSize(R.dimen.parallax_image_height);

        mListView = (ObservableListView) mRoot.findViewById(R.id.list);
        mListView.setScrollViewCallbacks(this);
        // Set padding view for ListView. This is the flexible space.
        View paddingView = new View(getActivity());
        AbsListView.LayoutParams lp = new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT,
                mParallaxImageHeight);
        paddingView.setLayoutParams(lp);

        // This is required to disable header's list selector effect
        paddingView.setClickable(true);

        mListView.addHeaderView(paddingView);
        ArrayList<CigarHolder> cigarHolderList = new ArrayList<CigarHolder>();
        ArrayList<Country> dC = new ArrayList<Country>();
        dC.add(Country.CUBA);
        ArrayList<Wrapper> dW = new ArrayList<Wrapper>();
        dW.add(Wrapper.CUBA);
        ArrayList<Filler> dF = new ArrayList<Filler>();
        dF.add(Filler.CUBA);
        Cigar ashton = new Cigar("Ashton","Virgin Sun Grown Spellbound","7.5","54",dC,dF,dW,"test5", Strength.FULL,"9");
        cigarHolderList.add(new CigarHolder("128","24","test9","9","test11","test12","test13","test14",ashton,R.drawable.vsg));
        Cigar illusione = new Cigar("Illusione","Fume D'Amour Toro","6.5","48",dC,dF,dW,"test5", Strength.FULL,"8");
        cigarHolderList.add(new CigarHolder("53","20","test9","8","test11","test12","test13","test14",illusione,R.drawable.illusione));
        Cigar montecristo = new Cigar("Montecristo","Monte No. 2","6.125","54",dC,dF,dW,"test5", Strength.FULL,"8");
        cigarHolderList.add(new CigarHolder("22","16","test9","8","test11","test12","test13","test14",montecristo,R.drawable.monte));
        Cigar oliva = new Cigar("Oliva","Serie V Melanio Figurado","6.5","52",dC,dF,dW,"test5", Strength.FULL,"9");
        cigarHolderList.add(new CigarHolder("48","12","test9","9","test11","test12","test13","test14",oliva,R.drawable.melanio));
        Cigar padron = new Cigar("Padron","Serie 1926 No. 2","5.5","52",dC,dF,dW,"test5", Strength.FULL,"10");
        cigarHolderList.add(new CigarHolder("300","12","test9","10","test11","test12","test13","test14",padron,R.drawable.padron));

        CigarListAdapter adapter = new CigarListAdapter(getActivity(), cigarHolderList,(com.example.fryjc.cigarconnoisseur.adapters.CigarListAdapter.iCall) getActivity() );
        mListView.setAdapter(adapter);

        // mListBackgroundView makes ListView's background except header view.
        mListBackgroundView = mRoot.findViewById(R.id.list_background);
        return mRoot;
    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {
        int baseColor = getResources().getColor(R.color.primary);
        float alpha = Math.min(1, (float) scrollY / mParallaxImageHeight);
        ViewHelper.setTranslationY(mImageView, -scrollY / 2);

        // Translate list background
        ViewHelper.setTranslationY(mListBackgroundView, Math.max(0, -scrollY + mParallaxImageHeight));
    }

    @Override
    public void onDownMotionEvent() {
    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {

    }


}
