package deginpattern.decorator;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:40:20
 */
public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用：" + order.cost());
        System.out.println("描述：" + order.getDes());

        System.out.println("-------加---------");

        // 加点单
        order = new Milk(order);
        System.out.println("加入一份牛奶过后价格：" + order.cost());
        System.out.println("加入一份牛奶过后：" + order.getDes());

        System.out.println("-------加---------");

        order = new Chocolate(order);
        System.out.println("再加一份巧克力" + order.cost());
        System.out.println("再加一份巧克力" + order.getDes());

        System.out.println("-------加---------");

        order= new Soy(order);
        System.out.println("再加一份豆浆" + order.cost());
        System.out.println("再加一份豆浆后" + order.getDes());

    }
}
