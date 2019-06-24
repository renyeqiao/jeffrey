package com.jeffrey.design_pattern.observer;

public interface Subject {

    void register(Observer observer);

    void delete(Observer observer);

    void notifyObserver();
}
