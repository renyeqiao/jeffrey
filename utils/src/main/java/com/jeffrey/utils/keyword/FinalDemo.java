package com.jeffrey.utils.keyword;

import java.util.concurrent.locks.ReentrantLock;

public class FinalDemo {

    final int v1 = 1;

    static final int v2 = 0 ;

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    public void method(final Integer age){
    }
}
