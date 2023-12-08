package com.example.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bearyang on 2016/12/30.
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list = new ArrayList<T>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (hasNext()) {
            obj = list.get(cursor++);
        }
        return obj;
    }
}
