package com.jeffrey.design_pattern.decorator;

import java.io.*;
import java.util.Properties;

public class Mocha extends CondimentBeverage {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha ";
    }

    @Override
    public double cost() {
        return 0.99+beverage.cost();
    }

    public static void main(String[] args) throws IOException {
//        Espresso espresso = new Espresso();
//
//        Mocha mocha = new Mocha(espresso);
//
//        System.out.println(mocha.getDescription()+mocha.cost());
//        FileInputStream fileInputStream = new FileInputStream(new File("./xxx"));

        StringBufferInputStream
    }
}
