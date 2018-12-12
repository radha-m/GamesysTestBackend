package com.processor;

/**
 * Created by Radha on 12/12/2018.
 */
public class timestamp {
    private String timestamp;
    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }



    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+"]";
    }
}
