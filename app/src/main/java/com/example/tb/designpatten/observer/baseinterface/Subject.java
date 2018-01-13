package com.example.tb.designpatten.observer.baseinterface;

/**
 * Created by tb on 2017/5/2.
 * 抽象主题
 */

public interface Subject {
    /**
     * 增加一个观察者
     * @param observer
     */
    public void addObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有的观察者
     */
    public void notifyObservers(Object... object);
}
