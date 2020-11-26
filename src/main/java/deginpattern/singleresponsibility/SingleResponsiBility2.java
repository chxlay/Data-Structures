package deginpattern.singleresponsibility;

/**
 * @Author: Alay
 * @Date: 2020-07-15 21:27:49
 */
public class SingleResponsiBility2 {

    public static void main(String[] args) {
        RoadVehicel roadVehicel = new RoadVehicel();
        roadVehicel.run("摩托车");
        AirVehicel airVehicel = new AirVehicel();
        airVehicel.run("飞机");
        WaterVehicel waterVehicel = new WaterVehicel();
        waterVehicel.run("轮船");
    }
}

/**
 * 路上交通工具类
 */
class RoadVehicel {
    public void run(String vehicel) {
        System.out.println(vehicel + "在路上跑");
    }

}

/**
 * 天上交通工具类
 */
class AirVehicel {
    public void run(String vehicel) {
        System.out.println(vehicel + "在天上飞");
    }

}

/**
 * 水里交通工具
 */
class WaterVehicel {
    public void run(String vehicel) {
        System.out.println(vehicel + "在水里运行");
    }
}