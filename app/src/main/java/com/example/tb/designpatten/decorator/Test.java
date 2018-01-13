package com.example.tb.designpatten.decorator;

import android.util.Log;

import com.example.tb.designpatten.decorator.abstractcomponent.House;
import com.example.tb.designpatten.decorator.concretecomponent.MyHouse;
import com.example.tb.designpatten.decorator.concretedecorator.DoorDecorator;
import com.example.tb.designpatten.decorator.concretedecorator.WindowDecorator;

/**
 * Created by tb on 2017/5/10.
 */

public class Test {
    public void test(){
        House house=new MyHouse();
        house=new WindowDecorator(house);
        house=new DoorDecorator(house);
        Log.e("Decorator:",house.getDescription());
    }
}
