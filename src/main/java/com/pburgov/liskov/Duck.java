package com.pburgov.liskov;


import org.apache.log4j.Logger;

public class Duck implements Bird {
    private static final Logger log = Logger.getLogger(Duck.class);

    @Override
    public void fly() {
        log.info("I can fly");
    }
}
