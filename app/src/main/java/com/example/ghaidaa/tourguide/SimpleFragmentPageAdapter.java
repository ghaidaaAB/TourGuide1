package com.example.ghaidaa.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ghaidaa on 14/10/2018.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public SimpleFragmentPageAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext=context;

    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new NatureFragment();
        }else if(position==1){
            return new HistorySitesFragment();
        }else if(position==2){
            return new ReligiousFragment();
        }else if(position==3){
            return new HotelsFragment();
        }else if(position==4){
            return new RestaurantsFragment();
        }else if(position==5){
            return new FastFoodFragment();
        }else {
            return new CafeFragment();
        }
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Nature Sites & Gardens";
        }else if (position==1){
            return "Historical Sites";
        }else if(position==2){
            return "Religious Sites";
        }else if(position==3){
            return "Hotels";
        }else if(position==4){
            return "Restaurants";
        }else if(position==5){
            return "Fast Food";
        }else {
            return "Cafes";
        }
    }
}


