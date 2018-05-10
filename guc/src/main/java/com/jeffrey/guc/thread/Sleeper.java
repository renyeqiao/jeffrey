package com.jeffrey.guc.thread;

public class Sleeper extends Thread {

    public Sleeper(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" start running!!");
        try {
            Thread.currentThread().interrupt();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return ;
        }
        System.out.println(this.getName()+" is over!!");
    }
}
