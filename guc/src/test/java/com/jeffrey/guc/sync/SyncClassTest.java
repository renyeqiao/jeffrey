package com.jeffrey.guc.sync;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncClassTest {

    ExecutorService exe = Executors.newFixedThreadPool(10);

    @Test
    public void testDoMethod(){
        final SyncClass syncClass = new SyncClass();
        exe.submit(new Runnable() {
            @Override
            public void run() {
                syncClass.doMethod();
            }
        });

        exe.submit(new Runnable() {
            @Override
            public void run() {
                syncClass.doMethod();
            }
        });
        for (;;){

        }
    }

    @Test
    public void testDoMethod1(){
        exe.submit(new Runnable() {
            @Override
            public void run() {
                SyncClass syncClass = new SyncClass();
                syncClass.doMethod1();
            }
        });

        exe.submit(new Runnable() {
            @Override
            public void run() {
                SyncClass syncClass = new SyncClass();
                syncClass.doMethod1();
            }
        });
        for (;;){

        }
    }

    @Test
    public void testDoMethod2(){
        SyncClass syncClass = new SyncClass();
        exe.submit(new Runnable() {
            @Override
            public void run() {
                synchronized (syncClass){
                    syncClass.doMethod2();
                }

            }
        });

        exe.submit(new Runnable() {
            @Override
            public void run() {
                synchronized (syncClass){
                    syncClass.doMethod2();
                }
            }
        });
        for (;;){

        }
    }

    @Test
    public void testDoMethod3(){
        exe.submit(new Runnable() {
            @Override
            public void run() {
                SyncClass.doMethod3();

            }
        });

        exe.submit(new Runnable() {
            @Override
            public void run() {
                SyncClass.doMethod3();
            }
        });
        for (;;){

        }
    }
}
