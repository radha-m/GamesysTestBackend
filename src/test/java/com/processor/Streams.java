package com.processor;

/**
 * Created by Radha on 12/12/2018.
 */
public class Streams {

    private String defaultGameFrequency;

    private String startTime;



    public String getDefaultGameFrequency ()
    {
        return defaultGameFrequency;
    }

    public void setDefaultGameFrequency (String defaultGameFrequency)
    {
        this.defaultGameFrequency = defaultGameFrequency;
    }



    public String getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (String startTime)
    {
        this.startTime = startTime;
    }

        @Override
    public String toString()
    {
        return "ClassPojo [defaultGameFrequency = "+defaultGameFrequency+", startTime = "+startTime+"]";
    }
}

