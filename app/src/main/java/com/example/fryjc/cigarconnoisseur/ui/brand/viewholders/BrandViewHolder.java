package com.example.fryjc.cigarconnoisseur.ui.brand.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.fryjc.cigarconnoisseur.R;

/**
 * Created by fryjc on 6/17/2015.
 */
public class BrandViewHolder extends RecyclerView.ViewHolder {

    public final TextView brand;


    public BrandViewHolder(View itemView) {
        super(itemView);
        brand = (TextView) itemView.findViewById(R.id.brandView);
    }
}
