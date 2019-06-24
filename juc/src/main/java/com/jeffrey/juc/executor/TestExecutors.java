package com.jeffrey.juc.executor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestExecutors {

    public static void main(String[] args) throws IOException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
//        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("schedule 开始了"+new Date());
                try {
                    Thread.sleep(4000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },3, TimeUnit.SECONDS);


        FileInputStream fis = new FileInputStream(new File("d:config.properties"));

        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("company"));
    }
}
