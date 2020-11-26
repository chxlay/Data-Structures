package deginpattern.proxy.cglib;

/**
 * @Author: Alay
 * @Date: 2020-09-13 16:47
 */
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        Teacher target = new Teacher();
        // 获取代理对象工厂
        CglibProxyFactory factory = new CglibProxyFactory(target);
        // 获得代理对象
        Teacher proxy = (Teacher) factory.createProxy();
        // 代理对象执行方法
        proxy.teach();
    }
}