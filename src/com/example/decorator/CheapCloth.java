package com.example.decorator;

public class CheapCloth extends PersonCloth {
    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShorts() {
        System.out.println("dress short pants");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }

}
