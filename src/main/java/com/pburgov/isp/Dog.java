package com.pburgov.isp;

public class Dog implements BarkingAnimal, RunningAnimal {
    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }

    @Override
    public void run() {
        System.out.print("Dog is running");
    }

}
