package com.jeffrey.juc.sync;

/**
 * synchronized总结：
 *  1/修饰静态方法，作用域是类
 *  2/修饰普通方法，作用域是类的实例
 *  3/修饰代码块，作用域是类的实例，synchronized(this) 和synchronized(obj)效果是一样的，前者是定义在具体方法提内，后者定义在方法体外(调用方法体内部)
 *
 */
public class SyncClass {

    private Integer si;

    public synchronized void doMethod(){
        System.out.println("doMethod running start......");
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doMethod running over......");
    }

    public void doMethod1(){
        synchronized (this){
            System.out.println("doMethod running start......");
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("doMethod running over......");
        }
    }

    public void doMethod2(){
        System.out.println("doMethod running start......");
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doMethod running over......");
    }


    public synchronized static void doMethod3(){
        System.out.println("doMethod running start......");
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doMethod running over......");
    }


}
