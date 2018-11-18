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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list ,container ,false);
        super.onCreate(savedInstanceState);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Bab al shamas\n Qanawt","6.4 Km",R.drawable.bab_al_shams));
        locations.add(new Location("Al mediaf\n Swaidaa","350 m",R.drawable.al_medief));
        locations.add(new Location("Al maraj\nDaher al jabal","7.1 Km",R.drawable.al_marag));
        locations.add(new Location("Al sefsaf\n Daher al jabal","6.4 Km",R.drawable.al_sefsaf));
        locations.add((new Location("Saada\n Daher al jabal","6.5 Km",R.drawable.saada)));

        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);

        final ListView listView =  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
