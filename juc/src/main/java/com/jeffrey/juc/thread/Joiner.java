package com.jeffrey.juc.thread;

public class Joiner extends Thread {

    private int index;

    public int getIndex() {
        return index;
    }

    public Sleeper sleeper;

    public void setIndex(int index) {
        this.index = index;
    }


    public Joiner(String name) {
        super(name);
        sleeper = new Sleeper("sleeper");
        sleeper.start();
    }

    @Override
    public void run() {
        synchronized (this){
            try {
                System.out.println(getName()+" start running!!!");
                sleeper.join();
                System.out.println(getName()+" is over!!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
