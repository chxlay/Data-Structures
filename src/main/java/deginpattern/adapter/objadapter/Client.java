package deginpattern.adapter.objadapter;


/**
 * @Author: Alay
 * @Date: 2020-07-19 22:22:01
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VolAdapter volAdapter = new VolAdapter();
        Vol220V vol220V = new Vol220V();
        // 可用构造器聚合，或者setter 聚合
        volAdapter.setVol220V(vol220V);
        phone.charging(volAdapter);
    }
}
