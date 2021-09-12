package com.company;

public class PizzaFactory {

    enum PizzaCrustsEnum {
        THIN,
        THICK,
        NONE
    }

    static Pizza createPizza(PizzaCrustsEnum type) {
        switch (type) {
            case THIN -> {
                return new PlainPizza();
            }
            case THICK -> {
                return new ThickCrust();
            }
            case NONE -> {
                return new Crustless();
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}