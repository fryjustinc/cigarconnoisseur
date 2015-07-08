package com.example.fryjc.cigarconnoisseur.ui.brand;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

import com.example.fryjc.cigarconnoisseur.R;

/**
 * Created by fryjc on 6/7/2015.
 */
public class BrandListAdapter extends ArrayAdapter<String> {
    private ArrayList<String> mList;
    private RequestQueue mRequestQueue;
    private Activity mContext;
    private iCall mCallBack;

    public BrandListAdapter(Activity context, ArrayList<String> list, iCall callBack)
    {
        super(context, R.layout.cigar_database_layout,list);
        mList = list;
        mContext=context;
        mCallBack = callBack;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = mContext.getLayoutInflater();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.brand, parent, false);
        BrandViewHolder holder = new BrandViewHolder(view);
        holder.brand.setText(getItem(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallBack.onClick(getItem(position));
            }
        });
        return view;
    }
    public static interface iCall{
        public void onClick(String brand);
    }


}
