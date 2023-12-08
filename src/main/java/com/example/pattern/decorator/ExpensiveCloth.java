package com.example.pattern.decorator;

public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt() {
        System.out.println("dress a T-shirt");
    }

    private void dressLeather() {
        System.out.println("dress a Leather");
    }

    private void dressJean() {
        System.out.println("dress Jean Pants");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
