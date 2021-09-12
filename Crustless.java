package com.company;

public class Crustless implements Pizza {

    @Override
    public String getDescription() {
        return "No Crust";
    }

    @Override
    public double getCost() {
        return 6.00;
    }
}
