package com.jeffrey.guc;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sync {

    private int numeric;

    ExecutorService es = Executors.newCachedThreadPool();


    @Test
    public void test() throws InterruptedException {
        Sync s = new Sync();
        final Sync_01 sync = new Sync_01();
        final Sync_01 sync01 = new Sync_01();
        for (int j = 0; j < 10; j++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        sync.increase(s);
                    }
                    System.out.println(s.numeric);
                }
            });
        }

        Thread.sleep(3000);

    }

    class Sync_01{

        private Sync sync;

        public Sync getSync() {
            return sync;
        }

        public void setSync(Sync sync) {
            this.sync = sync;
        }

        public synchronized void increase(Sync sync) {
            sync.numeric++;
        }

        public void increase(Integer sync) {
            sync++;
        }

        public void increase_02(){
            synchronized (sync){

            }
        }
    }
}
