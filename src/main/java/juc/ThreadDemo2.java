package juc;

/**
 * @Author: Alay
 * @Date: 2020-11-27 01:55
 */
public class ThreadDemo2 {
    public synchronized void getOne() {//ThreadDemo.class
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("1");
    }

    public synchronized void getTwo() {
        System.out.println("2");
    }

    public void getThree() {
        System.out.println("3");
    }
}