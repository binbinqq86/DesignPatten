package com.example.tb.designpatten.builder;

import android.util.Log;

import com.example.tb.designpatten.builder.subclass.TbBuilder2;

/**
 * Created by TianBin on 2018/1/13 17:54.
 * Description :
 */

public class Test {
    private static final String TAG = "Test";
    public void test(){
        Log.e(TAG, "test: "+new TbBuilder2().setAddress("china").setHost().setHouseNum(6).setStyle("田园").create().toString() );
    }
}
