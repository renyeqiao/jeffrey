package com.jeffrey.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class VoiceSubject implements Subject {


    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知入口
     */
    @Override
    public void notifyObserver() {
        for (Observer observer: observerList){
            observer.dosomething();
        }
    }

    public static void main(String[] args) {
        VoiceSubject voiceSubject = new VoiceSubject();
        VoiceObserver voiceObserver = new VoiceObserver(voiceSubject);
        voiceSubject.notifyObserver();
    }
}
