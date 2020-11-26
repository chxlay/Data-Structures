package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者案例
 */
public class TestProductorAndConsumer {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Productor pro1 = new Productor(clerk);
        Consumer con1 = new Consumer(clerk);

        new Thread(pro1, "生产者").start();
        new Thread(con1, "消费者").start();

        new Thread(pro1, "生产者1").start();
        new Thread(con1, "消费者1").start();
    }

}

//店员
class Clerk {

    private int product = 0;
    private Lock lock = new ReentrantLock();
    /**
     * 解决线程通信的
     */
    private Condition condition = lock.newCondition();

    //卖货
    public void sale() {//循环次数：0  product = 0;
        lock.lock();
        try {
            while (product <= 0) {
                System.out.println("缺货！");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName() + " 消费了 " + --product);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    //进货
    public void get() {//循环次数：0
        lock.lock();
        try {
            while (product >= 1) {
                System.out.println("产品已满！");

                try {
                    condition.await();
                } catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName() + " 生产了 " + ++product);

            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

}

//生产者
class Productor implements Runnable {

    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

            clerk.get();
        }
    }
}

//消费者
class Consumer implements Runnable {

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.sale();
        }
    }

}