package deginpattern.singleton.type5;

public class SingleTon {
    /**
     * 类加载时就创建一个对象实例,并且不允许修改
     */
    private static volatile SingleTon instance;

    /**
     * 构造器私有化，不让外部进行 new 对象
     */
    private SingleTon() {
    }

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建 instance,即懒汉式
     * 同步代码块
     *
     * @return
     */
    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                instance = new SingleTon();
            }
        }
        return instance;
    }
}