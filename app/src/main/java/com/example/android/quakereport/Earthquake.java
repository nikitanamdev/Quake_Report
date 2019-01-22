package com.example.android.quakereport;

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;
    public Earthquake(Double Magnitude,String Location,long TimeInMilliseconds,String Url)
    {
        mMagnitude=Magnitude;
        mLocation=Location;
        mTimeInMilliseconds=TimeInMilliseconds;
        mUrl=Url;
    }

    public Double getMagnitude()
    {
        return mMagnitude;
    }
    public String getLocation()
    {
        return mLocation;    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }
}
