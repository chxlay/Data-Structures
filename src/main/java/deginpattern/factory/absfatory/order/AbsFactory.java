package deginpattern.factory.absfatory.order;

import deginpattern.factory.absfatory.pizza.Pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:15:33
 */
public interface AbsFactory {

    Pizza createPizza(String orderType);
}
