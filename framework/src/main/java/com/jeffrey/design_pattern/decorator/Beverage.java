package com.jeffrey.design_pattern.decorator;

/**
 * 饮料基类
 */
public abstract class Beverage {

    String description="Unknown Beverage";//可继承

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
