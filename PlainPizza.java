package com.company;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Crust";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
