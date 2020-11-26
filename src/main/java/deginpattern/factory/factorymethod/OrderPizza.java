package deginpattern.factory.factorymethod;

import deginpattern.factory.simplefactory.pizza.factory.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author: Alay
 * @Date: 2020-07-19 16:07:36
 */
public abstract class OrderPizza {

    abstract public Pizza create() throws IOException;

    public String getType() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("请输入要订购的披萨类型：");
        String type = bufferedReader.readLine();
        return type;
    }

    public void orderPizza(OrderPizza orderPizza) throws IOException {
        Pizza pizza = orderPizza.create();
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();
    }
}
