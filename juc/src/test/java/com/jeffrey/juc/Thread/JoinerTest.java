package com.jeffrey.juc.Thread;

import com.jeffrey.juc.thread.Joiner;
import org.junit.Test;

public class JoinerTest {

    @Test
    public void joinTest() throws InterruptedException {

        Joiner joiner = new Joiner("joiner");
        joiner.start();
//        joiner.sleeper.interrupt();
//        joiner.stop();
        joiner.join();//等到子进程结束之后结束父进程
    }
}
