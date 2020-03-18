package com.company;

public interface Iterator <E>{

    E next();
    boolean hasNext();
    void remove();
}