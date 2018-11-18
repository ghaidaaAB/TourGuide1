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
public class ReligiousFragment extends Fragment {


    public ReligiousFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list ,container ,false);
        super.onCreate(savedInstanceState);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Ain Al Zaman temple\n Swaidaa","1.2 Km",R.drawable.ain_al_zaman));
        locations.add(new Location("Al nabi Shiet\n Thaker","43.3 Km",R.drawable.al_nabi_shiet));
        locations.add(new Location("Al Balkhi\nAl qraya","20 Km",R.drawable.al_balkhi));
        locations.add(new Location("Shihan Shrine\n Shahba","39.4 Km",R.drawable.shihan));
        locations.add((new Location("Abid mar\n Salkhad","33.1 Km",R.drawable.abid_mar)));
        locations.add((new Location("Bahaa Al Deen\n Hobran","15.3 Km",R.drawable.baha_aladin)));
        locations.add(new Location("Al Dalafa\n Rushayda","30.4 Km",R.drawable.al_dalafa));
        locations.add(new Location("Sama Hinidat Church\n Sama Hinidat","19.8 Km",R.drawable.sama_al_hinadat));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        final ListView listView =  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
