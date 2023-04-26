package com.pburgov.isp;

public class Bird implements FlyingAnimal, RunningAnimal {
    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }

    @Override
    public void run() {
        System.out.print("Bird is running");
    }

}
