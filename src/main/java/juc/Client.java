package juc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: Alay
 * @Date: 2020-09-13 20:16
 */
public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建Runnable 实现类对象
        MyThread myThread = new MyThread();
        // 创建 FutureTask 对象象示例，已多线程实现类为参数
        FutureTask<MyThread> task = new FutureTask<>(myThread);
        // 创建 Thread 实例对象；
        Thread thread = new Thread(task);
        // 执行多线程
        thread.start();
        // 接收到的返回值
        myThread = task.get();

        System.out.println("这是主线程的进程");
    }

    public static synchronized void show() {
        System.out.println("共享数操作的方法体");
    }
}
