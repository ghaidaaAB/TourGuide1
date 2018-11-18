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
public class HistorySitesFragment extends Fragment {


    public HistorySitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list ,container ,false);
        super.onCreate(savedInstanceState);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("As Suwayda Natonal museum\n Swiadaa ","2.3 Km",R.drawable.national_musem));
        locations.add(new Location("Helios Temple\n Qanawat","7.9 Km",R.drawable.helious_temple));
        locations.add(new Location("Qanawat Church\nQanawat","8.1 Km",R.drawable.qanawat_church));
        locations.add(new Location("Shahba Ports\n Shahba","19.6 Km",R.drawable.shahba_ports));
        locations.add((new Location("Teatro romano\n Shahba","19.7 Km",R.drawable.teatro_romano)));
        locations.add((new Location("Ambashi Old City\n Swiadaa Desert","40 Km",R.drawable.ambashi)));
        locations.add(new Location("Al mashnaka and Swadaa church\n Swaidaa","300 m",R.drawable.almashnaka));
        locations.add(new Location("Soltan Basha Al Atrash Shrine\n Al qraya","19.9 Km",R.drawable.soltan_shrine));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        final ListView listView =  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
