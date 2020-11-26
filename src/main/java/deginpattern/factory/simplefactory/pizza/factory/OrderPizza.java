package deginpattern.factory.simplefactory.pizza.factory;

import deginpattern.factory.simplefactory.pizza.CheesePizza;
import deginpattern.factory.simplefactory.pizza.GreekPizza;
import deginpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Alay
 * @Date: 2020-07-19 16:07:36
 */
public class OrderPizza {
    // 初始化直接 new 一个简单工厂类，组合关系，也可以用聚会关系，将工厂依赖进来
    private static final SimpleFactory simpleFactory = new SimpleFactory();

    public void orderPizza() throws IOException {
        boolean loop;
        do {
            String type = this.getType();
            Pizza pizza = simpleFactory.createPizza(type);
            if (null != pizza) {
                System.out.println("您订购的是：" + pizza.getName() + "披萨");
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
                loop = false;
            } else {
                System.out.println("没有您要的披萨");
                loop = true;
            }
        } while (loop);
    }

    private String getType() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("请输入要订购的披萨类型：");
        String type = bufferedReader.readLine();
        return type;
    }
}
