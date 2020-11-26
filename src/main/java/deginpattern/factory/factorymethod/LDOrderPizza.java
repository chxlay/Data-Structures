package deginpattern.factory.factorymethod;

import deginpattern.factory.simplefactory.pizza.factory.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Alay
 * @Date: 2020-07-19 16:07:36
 */
public class LDOrderPizza extends OrderPizza {


    @Override
    public Pizza create() throws IOException {
        boolean loop = false;
        Pizza pizza = null;
        do {
            String type = this.getType();
            switch (type) {
                case "cheese":
                    pizza = new LDCheesePizza();
                    break;
                case "peper":
                    pizza = new LDpeperPizza();
                    break;
                default:
                    loop = true;
                    break;
            }
        } while (loop);
        return pizza;
    }
}
