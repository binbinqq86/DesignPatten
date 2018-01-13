package com.example.tb.designpatten.decorator.concretecomponent;

import com.example.tb.designpatten.decorator.abstractcomponent.House;

/**
 * Created by tb on 2017/5/10.
 * 具体的需要装修的我的房子（具体组件）
 */

public class MyHouse extends House {
    private static final String TAG = "MyHouse";
    public MyHouse(){
        description=TAG+"：还未开始任何装修的毛坯房";
    }
    @Override
    public void decorate() {
        //具体装修逻辑，省略。。。
    }
}
