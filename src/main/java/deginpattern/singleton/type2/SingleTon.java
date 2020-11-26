package deginpattern.singleton.type2;

public class SingleTon {

    /**
     * 类加载时就创建一个对象实例,并且不允许修改
     */
    private static SingleTon instance;

    /**
     * 静态代码块
     */
    static {
        instance = new SingleTon();
    }

    /**
     * 构造器私有化，不让外部进行 new 对象
     */
    private SingleTon() {
    }

    /**
     * 提供一个公开的方法进行实例对象的获取
     *
     * @return
     */

    public static SingleTon getInstance() {
        return instance;
    }
}