package deginpattern.factory.simplefactory.pizza.factory;

import java.io.IOException;

/**
 * @Author: Alay
 * @Date: 2020-07-19 16:08:00
 */
public class Client {

    public static void main(String[] args) throws IOException {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.orderPizza();
    }
}
