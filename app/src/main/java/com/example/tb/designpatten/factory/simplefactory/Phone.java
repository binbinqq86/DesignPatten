package com.example.tb.designpatten.factory.simplefactory;

import android.util.Log;

/**
 * Created by tb on 2017/5/13.
 * 以手机为我们的产品
 */

public abstract class Phone {
    private static final String TAG = "Phone";

    /**
     * @param type 手机型号
     */
    public Phone(String type){
        printPhoneType(type);
    }

    public void printPhoneType(String type){
        Log.d(TAG, "printPhoneType: "+type);
    }
}
