package com.example.pattern.decorator;

//Boy 类是我们所要装饰的具体对象，先在需要一个装饰者来修饰我们的这个Boy对象
//这里定义一个PersonCloth类来表示人所穿着的衣服
public class Boy extends Person {

    @Override
    public void dressed() {
        // Boy 类下dressed方法的基本逻辑
        System.out.println("dress underwear");
    }
}
