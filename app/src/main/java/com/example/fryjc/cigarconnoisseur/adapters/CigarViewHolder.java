package com.example.fryjc.cigarconnoisseur.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.fryjc.cigarconnoisseur.R;

import org.w3c.dom.Text;

/**
 * Created by fryjc on 6/7/2015.
 */
public class CigarViewHolder extends RecyclerView.ViewHolder {
    public final com.android.volley.toolbox.NetworkImageView holderImage;
    public final TextView brand;
    public final TextView mname;
    public final TextView vitola;
    public final TextView age;
    public final TextView quantity;
    public final TextView rating;

    public CigarViewHolder(View itemView) {
        super(itemView);
        holderImage =(com.android.volley.toolbox.NetworkImageView) itemView.findViewById(R.id.image);
        brand = (TextView) itemView.findViewById(R.id.brand);
        mname = (TextView) itemView.findViewById(R.id.name);
        vitola = (TextView) itemView.findViewById(R.id.vitola);
        age = (TextView) itemView.findViewById(R.id.age);
        quantity = (TextView) itemView.findViewById(R.id.quantity);
        rating = (TextView) itemView.findViewById(R.id.rating);
    }
}
