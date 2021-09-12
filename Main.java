package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza1 = new Mushrooms(new Mushrooms(new TomatoSauce(new Gouda(new Pepperoni(new ThickCrust())))));
        Pizza pizza2 = new Onions(new Mushrooms(new PestoSauce(new AlfredoSauce(new PlainPizza()))));
        Pizza pizza3 = new Gouda(new PestoSauce(new Lettuce(new Crustless())));
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());
        System.out.println(pizza3.getDescription());
        System.out.println(pizza3.getCost());
    }
}
