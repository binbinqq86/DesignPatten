package com.example.tb.designpatten.strategy;

import android.util.Log;

import com.example.tb.designpatten.strategy.baseinterface.Line;
import com.example.tb.designpatten.strategy.baseinterface.Traffic;
import com.example.tb.designpatten.strategy.subclass.BusTravel;
import com.example.tb.designpatten.strategy.subclass.Line0;

/**
 * Created by tb on 2017/5/1.
 */

public class Test {
    private static final String TAG = "Test";
    public void test(){
        Line line=new Line0();
        Traffic traffic=new BusTravel();
        Travel travel=new Travel();
        travel.setLine(line);
        travel.setTraffic(traffic);
        Log.d(TAG, "test: cost is:"+travel.cost()+"\ntime is:"+travel.time());
    }
}
