package com.example.pattern.iterator;

/**
 * Created by bearyang on 2016/12/30.
 * 容器接口
 */
public interface Aggregate<T> {
    void add(T obj);

    void remove(T obj);


    /**
     * 获取容器的迭代器
     * */
    Iterator<T> iterator();

}
