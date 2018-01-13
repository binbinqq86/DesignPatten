package com.example.tb.designpatten.factory.abstractfactory.cpu;

import android.util.Log;

/**
 * Created by tb on 2017/5/13.
 * 华为的cpu
 */

public class CpuHelio extends Cpu{
    @Override
    public void printInfo() {
        Log.d("CPU:","CpuHelio");
    }
}
