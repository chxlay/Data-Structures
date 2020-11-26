package deginpattern.factory.absfatory.order;

import deginpattern.factory.absfatory.pizza.BJCheesePizza;
import deginpattern.factory.absfatory.pizza.BJpeperPizza;
import deginpattern.factory.absfatory.pizza.Pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:18:06
 */
public class BJfactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else {
            pizza = new BJpeperPizza();
        }
        return pizza;
    }
}
