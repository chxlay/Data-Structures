package deginpattern.builder.improve;

/**
 * @Author: Alay
 * @Date: 2020-07-19 21:27:35
 */
public class Client {
    public static void main(String[] args) {

        HouseDirect houseDirect = new HouseDirect();
        HouseBuilder builder = new CommonHouseBuilder();
        // 通过构造器完成 聚合关系
        // HouseDirect houseDirect = new HouseDirect(builder);
        // 通过 setter 实现 聚合关系
        houseDirect.setHouseBuilder(builder);
        House house = houseDirect.constructHouse();
    }
}
