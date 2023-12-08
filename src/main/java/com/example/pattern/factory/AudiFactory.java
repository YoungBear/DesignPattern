/**
 * 
 */
package com.example.pattern.factory;

/**
 * @author bearyang
 *
 */
public abstract class AudiFactory {

    /**
     * 某车型的工厂方法
     * 
     * @param clz
     *            具体的SUV型号类型
     * 
     * @return 具体型号的SUV车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);

}
