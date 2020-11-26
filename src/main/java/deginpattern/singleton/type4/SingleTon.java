package deginpattern.singleton.type4;

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
     * 提供一个静态的公有方法，当使用到该方法时，才去创建 instance,即懒汉式
     * 加入同步处理的代码
     *
     * @return
     */
    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}