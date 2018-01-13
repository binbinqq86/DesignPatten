package com.example.tb.designpatten.builder;

import com.example.tb.designpatten.builder.base.Builder;

/**
 * Created by TianBin on 2018/1/13 17:45.
 * Description :负责构造House
 */

public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public void construct(int houseNum,String style,String address){
        builder.setHouseNum(houseNum);
        builder.setStyle(style);
        builder.setAddress(address);
        builder.setHost();
    }
}
