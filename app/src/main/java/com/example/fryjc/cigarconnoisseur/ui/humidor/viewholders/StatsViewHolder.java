package com.example.fryjc.cigarconnoisseur.ui.humidor.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fryjc.cigarconnoisseur.R;

public class StatsViewHolder extends RecyclerView.ViewHolder {

    public final TextView numberOfTypes;
    public final TextView numberOfCigars;
    public final TextView oldest;
    public final TextView value;


    public StatsViewHolder(View itemView) {
        super(itemView);
        numberOfTypes = (TextView) itemView.findViewById(R.id.typeentry);
        numberOfCigars = (TextView) itemView.findViewById(R.id.numberentry);
        oldest = (TextView) itemView.findViewById(R.id.ageentry);
        value = (TextView) itemView.findViewById(R.id.moneyentry);

    }
}