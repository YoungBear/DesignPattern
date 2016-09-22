package com.example.decorator;

public abstract class PersonCloth extends Person {
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
