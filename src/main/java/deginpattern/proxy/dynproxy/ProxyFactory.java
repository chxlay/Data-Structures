package deginpattern.proxy.dynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Alay
 * @Date: 2020-09-13 15:25
 */
public class ProxyFactory {

    /**
     * 目标代理对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //说明
        // public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces, InvocationHandler h)
        //1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
        //2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
        //3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *以匿名内部类的形式传参
             * @param proxy 代理对象
             * @param method 调用的方法的返回对象(目标对象被代理的方法对象)
             * @param args 调用方法的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK 动态代理开始");
                Object invokeResult = method.invoke(target, args);
                System.out.println("JDK 动态代理后置");
                return invokeResult;
            }
        });
        return proxyInstance;
    }
}
