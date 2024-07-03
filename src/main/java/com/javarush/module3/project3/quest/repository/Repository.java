package com.javarush.module3.project3.quest.repository;

import java.util.Collection;

public interface Repository<T> {
    void create(T v);

    void update(T v);

    void delete(T v);

    Collection<T> getAll();
}
