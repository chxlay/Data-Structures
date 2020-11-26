package deginpattern.prototype;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:51:55
 */
public class Client {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        // ....10只

    }
}
