package deginpattern.factory.absfatory.order;

import deginpattern.factory.absfatory.pizza.*;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:18:31
 */
public class LDfactory  implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else {
            pizza = new LDpeperPizza();
        }
        return pizza;
    }
}
