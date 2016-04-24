package edu.iis.mto.time;

/**
 * Created by Kamil on 2016-04-24.
 */
public class TimeSourceFactory {
    public ITimeSource create(){
        return new TimeSource();
    }
}
