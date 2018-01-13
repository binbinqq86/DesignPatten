package com.example.tb.designpatten.factory.abstractfactory;

import com.example.tb.designpatten.factory.abstractfactory.cpu.Cpu;
import com.example.tb.designpatten.factory.abstractfactory.cpu.CpuHelio;
import com.example.tb.designpatten.factory.abstractfactory.cpu.CpuSnapDragon;
import com.example.tb.designpatten.factory.abstractfactory.memory.Memory;
import com.example.tb.designpatten.factory.abstractfactory.memory.MemorySamsung;
import com.example.tb.designpatten.factory.abstractfactory.memory.MemoryToshiba;

/**
 * Created by tb on 2017/5/13.
 * 具体工厂类2
 */

public class Factory2 extends AbstractFactory{
    @Override
    public Cpu getCpu() {
        return new CpuSnapDragon();
    }

    @Override
    public Memory getMemory() {
        return new MemoryToshiba();
    }
}
