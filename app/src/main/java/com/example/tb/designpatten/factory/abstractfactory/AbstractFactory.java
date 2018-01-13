package com.example.tb.designpatten.factory.abstractfactory;

import com.example.tb.designpatten.factory.abstractfactory.cpu.Cpu;
import com.example.tb.designpatten.factory.abstractfactory.memory.Memory;

/**
 * Created by tb on 2017/5/13.
 * 抽象工厂
 */

public abstract class AbstractFactory {
    /**
     * 手机cpu
     * @return
     */
    public abstract Cpu getCpu();

    /**
     * 手机内存
     * @return
     */
    public abstract Memory getMemory();
}
