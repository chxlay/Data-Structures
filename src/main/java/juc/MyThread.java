package juc;

import java.util.concurrent.Callable;

/**
 * @Author: Alay
 * @Date: 2020-09-13 20:14
 */
public class MyThread implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("这里实现具体业务逻辑");
        int result = 1;
        return result;
    }
}
