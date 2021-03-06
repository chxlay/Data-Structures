package deginpattern.bridge;

/**
 * @Author: Alay
 * @Date: 2020-07-21 21:25:01
 */
// 折叠样式的手机
public class FoldePhone extends Phone {

    @Override
    public Brand getBrand() {
        return super.getBrand();
    }

    @Override
    public void open() {
        super.open();
        System.out.println("打开的是折叠手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("关闭的是折叠手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("打电话的是折叠手机");
    }
}
