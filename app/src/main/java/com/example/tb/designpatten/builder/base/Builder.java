package com.example.tb.designpatten.builder.base;

/**
 * Created by TianBin on 2018/1/13 17:39.
 * Description :抽象Builder类
 */

public abstract class Builder {
    public abstract void setHost();
    public abstract void setHouseNum(int houseNum);
    public abstract void setStyle(String style);
    public abstract void setAddress(String address);
    public abstract House create();
}
