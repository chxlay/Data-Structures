package juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 一、解决多线程安全问题的方式：
 * 
 * 隐式锁
 * 1. 同步代码块
 * 
 * 2. 同步方法
 * 
 * 3. 同步锁 Lock
 * 显示锁，通过 lock() 方法上锁，必须通过 unlock() 方法释放锁
 */
public class TestLock {
	
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		new Thread(ticket, "1号窗口").start();
		new Thread(ticket, "2号窗口").start();
		new Thread(ticket, "3号窗口").start();
	}

}

class Ticket implements Runnable{
	
	int tick = 100;
	
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while(true){
			
			lock.lock();
			
			try{
				if(tick > 0){
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
					
					System.out.println(Thread.currentThread().getName() + " 完成售票，余票为：" + --tick);
				}
			}finally{
				lock.unlock();
			}
		}
	}
	
}