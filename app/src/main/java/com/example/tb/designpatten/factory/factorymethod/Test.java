package com.example.tb.designpatten.factory.factorymethod;

import com.example.tb.designpatten.factory.simplefactory.SimpleFactory;

/**
 * Created by tb on 2017/5/13.
 */

public class Test {
    public void test(){
        FactoryMethod factoryMethod=new FactoryInChina();
        factoryMethod.createPhone("mi2");

        factoryMethod=new FactoryInIndia();
        factoryMethod.createPhone("iphone8");
    }
}
