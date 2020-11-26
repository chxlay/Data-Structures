package deginpattern.bridge;

/**
 * @Author: Alay
 * @Date: 2020-07-21 21:23:40
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机啦");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
