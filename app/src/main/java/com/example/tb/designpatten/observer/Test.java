package com.example.tb.designpatten.observer;

import com.example.tb.designpatten.observer.concreteobserver.Parent0;
import com.example.tb.designpatten.observer.concreteobserver.Parent1;
import com.example.tb.designpatten.observer.concretesubject.Teacher;

/**
 * Created by tb on 2017/5/2.
 */

public class Test {

    public void test(){
        Teacher teacher=new Teacher();
        Parent0 p0=new Parent0(teacher);
        Parent1 p1=new Parent1(teacher);
        teacher.sendMessage("通知：五一国际劳动节放假三天。。。");
    }
}
