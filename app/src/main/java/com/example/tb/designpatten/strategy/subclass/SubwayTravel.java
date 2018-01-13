package com.example.tb.designpatten.strategy.subclass;

import com.example.tb.designpatten.strategy.baseinterface.Traffic;

/**
 * Created by tb on 2017/5/1.
 */

public class SubwayTravel implements Traffic {

    @Override
    public int getTrafficType() {
        return 1;
    }
}
