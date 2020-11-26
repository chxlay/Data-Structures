package deginpattern.adapter.classadapter;


/**
 * @Author: Alay
 * @Date: 2020-07-19 22:22:01
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VolAdapter volAdapter = new VolAdapter();
        phone.charging(volAdapter);
    }
}
