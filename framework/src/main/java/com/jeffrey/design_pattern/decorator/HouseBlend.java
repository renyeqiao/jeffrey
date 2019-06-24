package com.jeffrey.design_pattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(String description) {
        this.description = description;
    }

    @Override
    public double cost() {
        return .99;
    }
}
