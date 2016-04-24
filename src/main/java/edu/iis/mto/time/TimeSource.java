package edu.iis.mto.time;

/**
 * Created by Kamil on 2016-04-24.
 */
public class TimeSource implements ITimeSource {
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
