package com.jeffrey.juc.Thread.executor;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {


    @Test
    public void test(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                1,//核心线程数
                2,//最大线程数
                0l,//线程存活时间
                TimeUnit.SECONDS,//时间单位
                new LinkedBlockingQueue<Runnable>(),//队列
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略
        );
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 start");
                for(;;){

                }
            }
        });
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 start");
                for(;;){

                }
            }
        });
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread3 start");
                for(;;){

                }
            }
        });

        for(;;){

        }
    }
}
