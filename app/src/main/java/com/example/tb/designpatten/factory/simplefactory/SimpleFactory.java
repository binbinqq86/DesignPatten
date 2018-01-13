package com.example.tb.designpatten.factory.simplefactory;

/**
 * Created by tb on 2017/5/13.
 * 简单工厂模式（将createPhone方法改为静态就是静态工厂）
 */

public class SimpleFactory {
    public Phone createPhone(String type){
        Phone phone=null;
        if(type.equals("mi2")){
            phone=new MI2("mi2");
        }else if(type.equals("mi3")){
            phone=new MI3("mi3");
        }else{
            phone=new UnKnown(type);
        }
        return phone;
    }
}
