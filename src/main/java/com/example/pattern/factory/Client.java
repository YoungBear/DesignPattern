/**
 * 
 */
package com.example.pattern.factory;

/**
 * @author bearyang
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AudiFactory factory = new AudiCarAFactory();

        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }

}
