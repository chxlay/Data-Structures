package deginpattern.factory.absfatory.order;

import java.io.IOException;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:28:00
 */
public class Client {
    public static void main(String[] args) throws IOException {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.orderPizza(new BJfactory());
        orderPizza.orderPizza(new LDfactory());

    }
}
