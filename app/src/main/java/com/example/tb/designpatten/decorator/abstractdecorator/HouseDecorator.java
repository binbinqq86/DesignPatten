package com.example.tb.designpatten.decorator.abstractdecorator;

import com.example.tb.designpatten.decorator.abstractcomponent.House;

/**
 * Created by tb on 2017/5/10.
 * 用来装修房子的各种材料的抽象基类（抽象装饰者）
 */

public abstract class HouseDecorator extends House {
    /**
     * 返回房子装修情况
     * @return
     */
    public abstract String getDescription();

}
