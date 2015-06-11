package com.example.fryjc.cigarconnoisseur.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.example.fryjc.cigarconnoisseur.R;
import com.example.fryjc.cigarconnoisseur.models.cigarHolder;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.example.fryjc.cigarconnoisseur.LruBitmapCache;
import java.util.ArrayList;

/**
 * Created by fryjc on 6/7/2015.
 */
public class RecyclerAdapter  extends RecyclerView.Adapter<CigarViewHolder>{
    private ArrayList<cigarHolder> mList;
    private RequestQueue mRequestQueue;

    public RecyclerAdapter(ArrayList<cigarHolder> list)
    {
        mList = list;
    }

    @Override
    public CigarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cigarview, parent,false);
        CigarViewHolder holder = new CigarViewHolder(view);
    return holder;
    }

    @Override
    public void onBindViewHolder(CigarViewHolder holder, int position) {
        mRequestQueue = Volley.newRequestQueue(holder.holderImage.getContext());
        ImageLoader imageLoad = new ImageLoader(mRequestQueue,new LruBitmapCache(4000));
        holder.holderImage.setImageUrl(mList.get(position).getmSmallImageURL(), imageLoad);
        holder.mname.setText(mList.get(position).getCigar().name);
        holder.brand.setText(mList.get(position).getCigar().brand);
        holder.age.setText(mList.get(position).getAge());
        holder.quantity.setText(mList.get(position).getAmountOwned());
        holder.vitola.setText((int) mList.get(position).getCigar().length);
        holder.rating.setText((int) mList.get(position).getPersonalRating());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
