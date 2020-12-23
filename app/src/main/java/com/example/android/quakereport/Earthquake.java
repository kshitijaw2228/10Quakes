package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    //private String mDate;
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude,String location,long timeInMilliseconds)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    //public String getDate() {
        //return mDate;
    //}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
