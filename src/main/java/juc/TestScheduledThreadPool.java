package juc;

import java.util.concurrent.*;

public class TestScheduledThreadPool {
	
	public static void main(String[] args) throws Exception {
		//线程数量为5的线程池
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
		
		//分配任务
		for (int i = 0; i < 5; i++) {
			Future<Integer> future = pool.schedule(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int num = (int)(Math.random() * 101);
					System.out.println(Thread.currentThread().getName() + ": " + num);
					return num;
				}
				
			}, 3, TimeUnit.SECONDS);
			
			System.out.println(future.get());
		}
		//释放资源
		pool.shutdown();
	}

}