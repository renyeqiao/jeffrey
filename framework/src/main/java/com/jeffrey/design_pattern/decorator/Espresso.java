package com.jeffrey.design_pattern.decorator;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage{

    public Espresso() {
        this.description ="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
