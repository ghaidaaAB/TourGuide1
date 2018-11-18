package com.example.ghaidaa.tourguide;

/**
 * Created by Ghaidaa on 24/10/2018.
 */

public class Location {
private String mName;
private String mLocation;
private int mImageResourceId;

    //constructor
    public Location(String name,String location, int imageResourceId){
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }
    public Location(String name,String location){
        mName = name;
        mLocation = location;

    }

    //get functions
    public String getname(){
        return mName;
    }
    public String getLocation(){
        return mLocation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }


}
