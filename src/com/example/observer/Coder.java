package com.example.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bearyang
 *
 */
public class Coder implements Observer {
    // 观察者
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("Hi, " + name + ", DevTechFrontier has updated, content: " + arg1);
    }

    @Override
    public String toString() {
        return "Coder : " + name;
    }
}
