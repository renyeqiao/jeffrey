package com.jeffrey.juc.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class TestAqs extends AbstractQueuedSynchronizer {

    public static void main(String[] args) {
        TestAqs testAqs = new TestAqs();

        System.out.println(testAqs.getState());
        System.out.println(testAqs.compareAndSetState(0,1));
        System.out.println(testAqs.compareAndSetState(0,1));
        System.out.println(testAqs.getState());
    }

}
