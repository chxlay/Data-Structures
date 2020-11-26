package juc;

import lombok.Data;

/*
 * 线程锁的八种情况：
 * 1. 两个同步方法，一个对象，两个线程，分别调用 getOne()和 getTwo(), 打印？ //1 2
 * 2. 在 getOne() 方法中添加睡眠3秒，打印？ //1 2
 * 3. 添加非同步方法，启动三个线程，打印？ // 3 1 2
 * 4. 创建两个对象，一个调用 getOne() 一个调用getTwo(), 打印？ //2 1
 * 5. 将 getOne() 修改为静态同步方法，一个对象，打印？ //2 1
 * 6. 将 getTwo() 修改为静态同步方法，一个对象，打印？ //1 2
 * 7. 将 getTwo() 修改为非静态同步方法，两个对象， 打印？ //2 1
 * 8. 两个静态同步方法，两个对象，打印？// 1 2
 *
 * 结论：
 * ①非静态同步方法的锁为 this，静态同步方法的锁为当前类对象的 Class 实例
 * ②当多个线程共享一把锁，一个特定时间点只能有一个线程执行流执行，无论几个方法。
 */
public class TestThread8Moniter {

    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();
        ThreadDemo2 td2 = new ThreadDemo2();

        new Thread(new Runnable() {
            @Override
            public void run() {
                td.getOne();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                td2.getTwo();
            }
        }).start();
		
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				td.getThree();
			}
		}).start();*/
    }
}

