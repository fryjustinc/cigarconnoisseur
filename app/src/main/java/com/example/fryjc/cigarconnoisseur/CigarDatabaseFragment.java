package com.example.fryjc.cigarconnoisseur;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fryjc.cigarconnoisseur.adapters.*;
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
        BrandListAdapter adapter = new BrandListAdapter(getActivity(), mBrandList,(com.example.fryjc.cigarconnoisseur.adapters.BrandListAdapter.iCall) getActivity() );
        mListView.setAdapter(adapter);
        return root;

    }

}
