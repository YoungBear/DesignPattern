package com.example.pattern.iterator;

/**
 * Created by bearyang on 2016/12/30.
 */
public class Client {

    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("Aige");
        a.add("Studio\n");
        a.add("SM");
        a.add(" Brother");
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
        }
    }
}
