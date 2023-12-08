/**
 * 
 */
package com.example.pattern.factory;

/**
 * @author bearyang
 *
 */
public class AudiQ7 extends AudiCar {

    @Override
    public void drive() {
        System.out.println("Q7 start!");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7 selfNavigation.");
    }
}
