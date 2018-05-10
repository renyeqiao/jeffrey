package com.jeffrey.guc.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadTest {

   static  ExecutorService executorService = Executors.newCachedThreadPool();

    static void catchTest() {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException();
            }
        });
        executorService.shutdown();
    }

    public static void main(String args[]){
        catchTest();
    }
}
