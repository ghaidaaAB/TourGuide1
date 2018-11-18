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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list ,container ,false);
        super.onCreate(savedInstanceState);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Tourist hotel \n Swaidaa","600 m",R.drawable.tourist_hotel));
        locations.add(new Location("Amer hotel\n Swaidaa","800 m",R.drawable.amer_hotel));
        locations.add(new Location("Your address hotel \nSwaidaa","6.8 Km",R.drawable.your_address_hotel));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        final ListView listView =  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
