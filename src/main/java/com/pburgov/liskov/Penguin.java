package com.pburgov.liskov;

public class Penguin implements Bird{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("I cannot fly!");
    }
}
