package deginpattern.singleresponsibility;

/**
 * @Author: Alay
 * @Date: 2020-07-15 21:37:23
 */
public class SingleResponsiBility3 {
    public static void main(String[] args) {
        Vehicel2 vehicel2 = new Vehicel2();
        vehicel2.runRoad("摩托车");
        vehicel2.runWater("轮船");
        vehicel2.runAir("飞机");

    }
}

class Vehicel2 {
    public void runRoad(String vehicel) {
        System.out.println(vehicel + "在公路上跑");
    }

    public void runAir(String vehicel) {
        System.out.println(vehicel + "在天空运行");
    }

    public void runWater(String vehicel) {
        System.out.println(vehicel + "在水里运行");
    }
}
