package deginpattern.factory.simplefactory.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:21:06
 */
public class OrderPizza {

    public OrderPizza() throws IOException {
        Pizza pizza = null;
        boolean loop = true;
        do {
            String type = this.getType();
            switch (type) {
                case "cheess":
                    pizza = new CheesePizza();
                    loop = false;
                    break;
                case "greek":
                    pizza = new GreekPizza();
                    loop = false;
                    break;
                default:
                    System.out.println("没有您要订购的");
                    break;
            }
            if (null != pizza) {
                System.out.println("您订购的是：" + pizza.getName() + "披萨");
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
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
