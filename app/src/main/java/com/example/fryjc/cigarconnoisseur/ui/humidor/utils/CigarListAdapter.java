package com.example.fryjc.cigarconnoisseur.ui.humidor.utils;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.android.volley.RequestQueue;
import com.example.fryjc.cigarconnoisseur.R;
import com.example.fryjc.cigarconnoisseur.models.CigarHolder;

import java.util.ArrayList;

public class CigarListAdapter extends ArrayAdapter<CigarHolder> {
    private ArrayList<CigarHolder> mList;
    private RequestQueue mRequestQueue;
    private Activity mContext;
    private iCall mCallBack;

    public CigarListAdapter(Activity context, ArrayList<CigarHolder> list, iCall callBack)
    {
        super(context, R.layout.tab_1,list);
        mList = list;
        mList.add(0, null);
        mContext=context;
        mCallBack = callBack;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(position==0){
            LayoutInflater inflater2 = mContext.getLayoutInflater();
            View statsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.humidor_stats_view, parent, false);
            StatsViewHolder statsHolder = new StatsViewHolder(statsView);
            int count=0;
            int typeCount = 0;
            int value=0;
            String oldest=mList.get(1).getAge();

            for(int i = 1; i <mList.size(); i++){
                CigarHolder cigar = mList.get(i);
                count +=  Integer.parseInt(cigar.getAmountOwned());
                typeCount++;
                if(Integer.parseInt(oldest) < Integer.parseInt(cigar.getAge()))
                    oldest = cigar.getAge();
            }

            statsHolder.numberOfCigars.setText(Integer.toString(count));
            statsHolder.numberOfTypes.setText(Integer.toString(typeCount));
            statsHolder.value.setText("$758");
            statsHolder.oldest.setText(oldest);
            return statsView;
        }
        LayoutInflater inflater = mContext.getLayoutInflater();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cigarlistview, parent, false);
        CigarViewHolder holder = new CigarViewHolder(view);
        holder.holderImage.setImageResource(getItem(position).getmImage());
        holder.brand.setText(getItem(position).getCigar().brand);
        holder.rating.setText(getItem(position).getPersonalRating());
        holder.vitola.setText(getItem(position).getCigar().length+"x"+getItem(position).getCigar().getRingGauge());
        holder.quantity.setText(getItem(position).getAmountOwned());
        holder.age.setText(getItem(position).getAge() + " Days");
        holder.mname.setText(getItem(position).getCigar().name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallBack.onClick(getItem(position));
            }
        });
        return view;
    }
    public static interface iCall{
        public void onClick(CigarHolder cigarHolder);
    }


}