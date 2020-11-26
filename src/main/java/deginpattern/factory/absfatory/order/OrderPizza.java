package deginpattern.factory.absfatory.order;

import deginpattern.factory.absfatory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:21:55
 */
public class OrderPizza {
    private AbsFactory factory;

    public void orderPizza(AbsFactory factory) throws IOException {
        do {
            String type = this.getType();
            Pizza pizza = factory.createPizza(type);
            if (null != pizza) {
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
                break;
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    public String getType() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("请输入要订购的披萨类型：");
        String type = bufferedReader.readLine();
        return type;
    }
}
