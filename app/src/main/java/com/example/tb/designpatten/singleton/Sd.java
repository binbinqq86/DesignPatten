package com.example.tb.designpatten.singleton;

/**
 * Created by TianBin on 2017/7/8 17:50.
 * Description :静态内部类
 */

public class Sd {
    private Sd(){}

    public static Sd getInstance(){
        return SingletonHolder.instance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final Sd instance=new Sd();
    }
}
