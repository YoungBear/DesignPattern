package com.example.pattern.observer;

import java.util.Observable;

public class DevTechFrontier extends Observable {
    // 被观察者
    public void postNewPublication(String content) {
        // 标识状态或者内容发生改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
