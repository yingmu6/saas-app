package com.orange.core;

import java.util.List;

public interface IBaseDAO<T> {

    void add(T t);

    int update(T t);

    T getById(Object id);

    List<T> findList(Object t);

    int remove(Object id);
}
