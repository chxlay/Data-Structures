package deginpattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Alay
 * @Date: 2020-09-13 16:33
 */
public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * @param proxyTarget 代理对象
     * @param method      调用的方法的返回对象
     * @param args        调用方法的参数
     * @param methodProxy 调用方法的代理方法的反射对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxyTarget, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理前处理");
        Object invokeSuper = methodProxy.invokeSuper(target, args);
        System.out.println("代理后处理");
        return invokeSuper;
    }

    public Object createProxy() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类(被代理对象的类)
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建出代理对象
        Object result = enhancer.create();
        return result;
    }
}
