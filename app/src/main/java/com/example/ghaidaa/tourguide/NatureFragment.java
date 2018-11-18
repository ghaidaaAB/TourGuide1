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
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list ,container ,false);
        super.onCreate(savedInstanceState);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Wadi Al Almodlem\n Al Raha","5.4 Km",R.drawable.wadi_al_modlem));
        locations.add(new Location("Fayhaa garden\n Swiadaa","3.3 Km",R.drawable.fayhaa));
        locations.add(new Location("Al Raha forest\nAl Raha","5.4 Km",R.drawable.arraha_forest));
        locations.add(new Location("Al domnh forst reserve\n Al swiadaa","3 Km",R.drawable.al_demna));
        locations.add((new Location("Matar al kafer\n Al kafer","12.1 Km",R.drawable.matar_al_kafer)));
        locations.add((new Location("Al wafaa garden\n Swiadaa","2 Km")));
        locations.add(new Location("Wadi slim\n Slim","10.3 Km",R.drawable.wadi_slim));
        locations.add(new Location("Bostan al basha\n Al qraya","19.8 Km"));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        final ListView listView =  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
