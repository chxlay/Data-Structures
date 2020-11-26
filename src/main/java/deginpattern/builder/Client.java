package deginpattern.builder;

/**
 * @Author: Alay
 * @Date: 2020-07-19 20:56:10
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HightHouse hightHouse = new HightHouse();
        hightHouse.build();
    }
}
