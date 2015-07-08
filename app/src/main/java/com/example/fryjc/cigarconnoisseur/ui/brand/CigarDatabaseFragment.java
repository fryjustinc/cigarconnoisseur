package com.example.fryjc.cigarconnoisseur.ui.brand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fryjc.cigarconnoisseur.R;
import com.example.fryjc.cigarconnoisseur.ui.brand.BrandListAdapter;
import com.example.fryjc.cigarconnoisseur.ui.main.FragmentNavigationDrawer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by fryjc on 6/11/2015.
 */
public class CigarDatabaseFragment extends Fragment {
    ListView mListView;
    ArrayList<String> mBrandList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.cigar_database_layout, container, false);
        mListView = (ListView) root.findViewById(R.id.listView);
        String serializedValue = getArguments().getString(FragmentNavigationDrawer.cigarDBKey);
        Gson gson = new Gson();
        mBrandList = gson.fromJson(serializedValue,new TypeToken<ArrayList<String>>(){}.getType());
        BrandListAdapter adapter = new BrandListAdapter(getActivity(), mBrandList,(BrandListAdapter.iCall) getActivity() );
        mListView.setAdapter(adapter);
        return root;

    }

}
