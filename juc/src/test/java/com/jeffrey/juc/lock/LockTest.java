package com.jeffrey.juc.lock;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-14 10:52
 **/
public class LockTest {

    ExecutorService exe = Executors.newFixedThreadPool(10);

    @Test
    public void test() throws InterruptedException {
        exe.submit(new Runnable() {
            @Override
            public void run() {
                LockClass lockClass= new LockClass();
                lockClass.doMethod();
            }
        });

        exe.submit(new Runnable() {
            @Override
            public void run() {
                LockClass lockClass= new LockClass();
                lockClass.doMethod2();
            }
        });

        Thread.sleep(10000l);

    }
}
