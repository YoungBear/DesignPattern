package com.example.pattern.decorator;

public class Test {

    public static void main(String[] args) {
        // 首先我们要有一个Person男孩
        Person person = new Boy();

        // 穿上便宜衣服
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();

        // 穿上高级衣服
        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
