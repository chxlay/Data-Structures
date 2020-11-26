package deginpattern.factory.simplefactory.pizza.factory;

import deginpattern.factory.simplefactory.pizza.CheesePizza;
import deginpattern.factory.simplefactory.pizza.GreekPizza;
import deginpattern.factory.simplefactory.pizza.Pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:58:19
 */
public class SimpleFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case "greek":
                pizza = new GreekPizza();
                break;
            case "cheese":
                pizza = new CheesePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}