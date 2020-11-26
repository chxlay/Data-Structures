package deginpattern.prototype.improve;


/**
 * @Author: Alay
 * @Date: 2020-07-19 18:51:55
 */
public class Client {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep clone = sheep.clone();
        System.out.println(clone);
        System.out.println(clone==sheep);

    }
}
