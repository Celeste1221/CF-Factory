package com.company;

public class ToppingsFactory {

    enum ToppingsEnum {

        MUSHROOM {
            public ToppingDecorator getInstance(Pizza target) {
                return new Mushrooms(target);
            }
        },
        PEPPERONI {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new Pepperoni(target);
            }
        },
        GOUDA {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new Gouda(target);
            }
        },
        ALFREDOSAUCE {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new AlfredoSauce(target);
            }
        },
        LETTUCE {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new Lettuce(target);
            }
        },
        MOZZARELLA {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new Mozzarella(target);
            }
        },
        ONIONS {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new Onions(target);
            }
        },
        PESTOSAUCE {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new PestoSauce(target);
            }
        },
        TOMATOSAUCE {
            @Override
            public ToppingDecorator getInstance(Pizza target) {
                return new TomatoSauce(target);
            }
        };

        public abstract ToppingDecorator getInstance(Pizza target);
    }

    static Pizza decoratePizza(ToppingsFactory.ToppingsEnum[] toppings, Pizza target) {
        for(ToppingsEnum topping: toppings){
            target = topping.getInstance(target);
        }
        return target;
    }
}
