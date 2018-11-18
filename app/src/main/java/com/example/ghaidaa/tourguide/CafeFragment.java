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
public class CafeFragment extends Fragment {


    public CafeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list ,container ,false);
        super.onCreate(savedInstanceState);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Divino\n Swaidaa","1.7 Km",R.drawable.divino));
        locations.add(new Location("Domino\n Swaidaa","1.1 Km",R.drawable.domino));
        locations.add(new Location("Tote Cafe\n Swaidaa","1.3 Km",R.drawable.tote));
        locations.add(new Location("Cheilo\n Swaidaa","650 m",R.drawable.chello));


        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        final ListView listView =  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
