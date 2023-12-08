package com.example.pattern.decorator;

public abstract class PersonCloth extends Person {
    // 保持一个Person类的引用
    // 可以方便地调用具体被装饰对象中的方法
    protected Person mPerson;

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        // 调用Person类中的dressed方法
        mPerson.dressed();
    }
}
