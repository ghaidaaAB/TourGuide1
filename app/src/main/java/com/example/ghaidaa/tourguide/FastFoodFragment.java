package com.example.ghaidaa.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FastFoodFragment extends Fragment {


    public FastFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
             View rootView = inflater.inflate(R.layout.location_list ,container ,false);
            super.onCreate(savedInstanceState);

            final ArrayList<Location> locations = new ArrayList<Location>();
            locations.add(new Location("Jabinco\n Swaidaa","350 m",R.drawable.japinco));
        locations.add(new Location("Al said\n Swaidaa","700 m",R.drawable.al_said));
        locations.add(new Location("Supreme\n Swaidaa","1 Km",R.drawable.supreme));
        locations.add(new Location("Pizza Roma\n Swaidaa","1.3 Km",R.drawable.pizza_roma));
        locations.add(new Location("Dixy Chicken\n Swaidaa","2.2 Km",R.drawable.dixy_checken));

            LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

            final ListView listView =  rootView.findViewById(R.id.list);

            listView.setAdapter(adapter);

            return rootView;
        }
    }


