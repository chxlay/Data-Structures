package juc;

import java.util.concurrent.CountDownLatch;

/*
 * CountDownLatch : 闭锁，在其他多个线程进行运算时，当前线程处于等待状态，若其他线程运行结束后，当前线程再进行计算。
 */
public class TestCountDownLatch {
	
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(10);
		
		LatchDemo ld = new LatchDemo(latch);
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			new Thread(ld).start();
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("耗费时间为：" + (end - start));
	}

}

class LatchDemo implements Runnable{
	
	private CountDownLatch latch;
	
	public LatchDemo(CountDownLatch latch){
		this.latch = latch;
	}
	
	@Override
	public void run() {
		
		try{
			for (int i = 0; i <= 50000; i++) {
				if(i % 2 == 0){
					System.out.println(i);
				}
			}
			
		}finally{
			latch.countDown();
		}
		
	}
	
}