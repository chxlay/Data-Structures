package deginpattern.factory.factorymethod;


import java.io.IOException;

/**
 * @Author: Alay
 * @Date: 2020-07-19 16:07:36
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    public Pizza create() throws IOException {
        boolean loop = false;
        Pizza pizza = null;
        do {
            String type = this.getType();
            switch (type) {
                case "cheese":
                    pizza = new BJCheesePizza();
                    break;
                case "peper":
                    pizza = new BJpeperPizza();
                    break;
                default:
                    loop = true;
                    break;
            }
        } while (loop);
        return pizza;
    }
}
