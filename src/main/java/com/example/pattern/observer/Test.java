package com.example.pattern.observer;

public class Test {

    public static void main(String[] args) {
        // 被观察者
        DevTechFrontier devTechFrontier = new DevTechFrontier();

        // 观察者
        Coder mrSimple = new Coder("mr.simple");
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");

        // 注册
        devTechFrontier.addObserver(mrSimple);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        // 发布消息
        devTechFrontier.postNewPublication("This is new Publication!");

    }

}
