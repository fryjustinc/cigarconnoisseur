package com.example.fryjc.cigarconnoisseur.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fryjc.cigarconnoisseur.R;
import com.example.fryjc.cigarconnoisseur.models.NavDrawerItem;

import java.util.ArrayList;

/**
 * Created by fryjc on 5/27/2015.
 */
public class NavDrawerListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NavDrawerItem> navDrawerItems;

    public NavDrawerListAdapter(Context context, ArrayList<NavDrawerItem> navDrawerItems){
        this.context = context;
        this.navDrawerItems = navDrawerItems;
    }

    @Override
    public int getCount() {
        return navDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = LayoutInflater.from(context);
            convertView = mInflater.inflate(R.layout.drawer_nav_item, null);
        }

        TextView txtTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        ImageView navImage = (ImageView) convertView.findViewById(R.id.tvIcon);

        txtTitle.setText(navDrawerItems.get(position).getTitle());
        navImage.setImageResource(navDrawerItems.get(position).getPic());
        return convertView;
    }

}