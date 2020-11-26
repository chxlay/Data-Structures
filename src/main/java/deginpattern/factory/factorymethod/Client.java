package deginpattern.factory.factorymethod;

import sun.applet.Main;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: Alay
 * @Date: 2020-07-19 17:16:59
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("其输入地区");
        Scanner scanner = new Scanner(System.in);
        String addr = scanner.nextLine();
        OrderPizza orderPizza;
        if (addr.equals("BJ")) {
            orderPizza = new BJOrderPizza();
        } else {
            orderPizza = new LDOrderPizza();
        }
        orderPizza.orderPizza(orderPizza);
    }
}
