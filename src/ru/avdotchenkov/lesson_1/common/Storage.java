package ru.avdotchenkov.lesson_1.common;

public interface Storage {
    void add(Object value);

    void add(Object value, int index);

    void remove(int index);

    Object get(int index);

    boolean contains(Object value);

    void display();

}
