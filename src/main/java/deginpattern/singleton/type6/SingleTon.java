package deginpattern.singleton.type6;

public class SingleTon {
    /**
     * 类加载时就创建一个对象实例,并且不允许修改
     */
    private static SingleTon instance;

    /**
     * 构造器私有化，不让外部进行 new 对象
     */
    private SingleTon() {
    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
     * 同时保证了效率, 推荐使用
     *
     * @return
     */
    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}