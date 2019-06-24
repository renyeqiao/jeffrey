package com.jeffrey.design_pattern.observer;

public class VoiceObserver implements Observer {

    private Subject subject;

    public VoiceObserver(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void dosomething() {
        System.out.println("你好，我收到消息了，开始行动");
    }
}
