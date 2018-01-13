package com.example.tb.designpatten.decorator.concretedecorator;

import com.example.tb.designpatten.decorator.abstractcomponent.House;
import com.example.tb.designpatten.decorator.abstractdecorator.HouseDecorator;

/**
 * Created by tb on 2017/5/10.
 * 门（具体装饰者）
 */

public class DoorDecorator extends HouseDecorator {
    /**
     * 持有一个house类的引用
     */
    private House house;

    public DoorDecorator(House house){
        this.house=house;
    }

    @Override
    public void decorate() {
        //执行具体的装修逻辑，代码省略。。。
    }

    @Override
    public String getDescription() {
        return house.getDescription()+"——增加了门";
    }
}
