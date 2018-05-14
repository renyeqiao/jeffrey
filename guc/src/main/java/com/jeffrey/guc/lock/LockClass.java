package com.jeffrey.guc.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-14 10:49
 **/
public class LockClass {

    private static ReentrantLock lock = new ReentrantLock();

    public void doMethod(){
        lock.lock();
        try {
            System.out.println("doMethod running start");
            Thread.sleep(4000l);
            System.out.println("doMethod running over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void doMethod2(){
        try {
            Thread.sleep(500l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        try {
            System.out.println("doMethod2 running start");
            System.out.println("doMethod2 running over");
        } finally {
            lock.unlock();
        }
    }

}
