package com.example.tb.designpatten.strategy;

import com.example.tb.designpatten.strategy.baseinterface.Line;
import com.example.tb.designpatten.strategy.baseinterface.Traffic;

/**
 * Created by tb on 2017/5/1.
 * 包括了（公交-0，地铁-1，火车-2，飞机-3，轮船-4，出租车-5，大巴车-6，轻轨-7，自驾-8）等等各种出行方式的出行帮助系统核心类
 */

public class Travel {
    private Line line;
    private Traffic traffic;

    private int realLine,realTraffic;

    public void Travel(Line line,Traffic traffic){
        this.line=line;
        this.traffic=traffic;
        realLine=line.getLine();
        realTraffic=traffic.getTrafficType();
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public void setTraffic(Traffic traffic) {
        this.traffic = traffic;
    }

    /**
     * 花费
     * @return
     */
    public float cost(){
        //根据路线和交通工具去计算具体的花费。。。
        return 0;
    }

    /**
     * 耗时
     * @return
     */
    public long time(){
        //根据路线和交通工具去计算具体的花费。。。
        return 0;
    }
}
