package deginpattern.singleresponsibility;

/**
 * @Author: Alay
 * @Date: 2020-07-15 21:15:15
 */
public class SingleResponsiBility1 {

    public static void main(String[] args) {
        Vehicel vehicel = new Vehicel();
        vehicel.run("自行车");
        vehicel.run("汽车");
        vehicel.run("飞机");
    }

}

class Vehicel {
    public void run(String vehicel) {
        System.out.println(vehicel + "在公路上跑");
    }
}