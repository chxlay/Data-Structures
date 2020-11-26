package juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadPool {

    public static void main(String[] args) throws Exception {

        ExecutorService pool = Executors.newFixedThreadPool(5);

        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<Integer> future = pool.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {
                    int num = (int) (Math.random() * 101);
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    return num;
                }
            });

            list.add(future);
        }

        pool.shutdown();

        for (Future<Integer> future : list) {
            System.out.println(future.get());
        }
		
		/*ThreadPoolDemo tp = new ThreadPoolDemo();
		
		//创建数量为 5 的线程池
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		//分配任务
		for (int i = 0; i < 10; i++) {
			pool.submit(tp);
		}
		
		//释放资源
		pool.shutdown();*/
    }

    /*
     * new Thread(tp).start();
     * new Thread(tp).start();
     */
}

class ThreadPoolDemo implements Runnable {

    private int i = 0;

    @Override
    public void run() {

        while (i <= 100) {
            System.out.println(Thread.currentThread().getName() + ":" + i++);
        }

    }

}