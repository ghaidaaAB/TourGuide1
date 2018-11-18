package com.example.ghaidaa.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ghaidaa on 24/10/2018.
 */

public class LocationAdapter extends ArrayAdapter <Location> {
    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    public LocationAdapter (Activity context, ArrayList<Location> list)
    {
        super(context,0,list);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        final Location cuurentLocation = getItem(position);
        View textViews = listItemView.findViewById(R.id.text_views);

        TextView nameView =  listItemView.findViewById(R.id.name_text);
        nameView.setText(cuurentLocation.getname());

        TextView locationView = listItemView.findViewById(R.id.location_text);
        locationView.setText(cuurentLocation.getLocation());

        ImageView image =  listItemView.findViewById(R.id.image_view);
        image.setImageResource(cuurentLocation.getImageResourceId());

        return listItemView;
    }
}
