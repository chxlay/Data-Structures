package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 编写一个程序，开启 3 个线程，这三个线程的 ID 分别为 A、B、C，每个线程将自己的 ID 在屏幕上打印 10 遍，要求输出的结果必须按顺序显示。
	如：ABCABCABC…… 依次递归
 */
public class TestAlternate {

    public static void main(String[] args) {
        AlternateDemo ad = new AlternateDemo();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    ad.loopA(i);
                }
            }
        }, "A").start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    ad.loopB(i);
                }
            }
        }, "B").start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    ad.loopC(i);
                }
            }
        }, "C").start();
    }

}

class AlternateDemo {

    private int number = 1; //用于判断执行线程的标记

    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void loopA(int totalLoop) {
        lock.lock();

        try {

            //判断
            if (number != 1) {
                try {
                    c1.await();
                } catch (InterruptedException e) {
                }
            }

            //打印
            for (int i = 1; i <= 1; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i + " : " + totalLoop);
            }

            //唤醒
            number = 2;
            c2.signal();

        } finally {
            lock.unlock();
        }
    }

    public void loopB(int totalLoop) {
        lock.lock();

        try {

            //判断
            if (number != 2) {
                try {
                    c2.await();
                } catch (InterruptedException e) {
                }
            }

            //打印
            for (int i = 1; i <= 1; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i + " : " + totalLoop);
            }

            //唤醒
            number = 3;
            c3.signal();

        } finally {
            lock.unlock();
        }
    }

    public void loopC(int totalLoop) {
        lock.lock();

        try {

            //判断
            if (number != 3) {
                try {
                    c3.await();
                } catch (InterruptedException e) {
                }
            }

            //打印
            for (int i = 1; i <= 1; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i + " : " + totalLoop);
            }

            //唤醒
            number = 1;
            c1.signal();

        } finally {
            lock.unlock();
        }
    }
}