package juc;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class TestForkJoinPool {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();

        ForkJoinTask<Long> task = new ForkJoinSum(0L, 30000000000L);

        long sum = pool.invoke(task);

        System.out.println(sum);

        long end = System.currentTimeMillis();

        System.out.println("耗费时间为：" + (end - start)); //291 4656
    }

    @Test
    public void test1() {
        long start = System.currentTimeMillis();

        long sum = 0L;

        for (long i = 0; i <= 30000000000L; i++) {
            sum += i;
        }

        System.out.println(sum);

        long end = System.currentTimeMillis();

        System.out.println("耗费时间为：" + (end - start));//69 3966
    }

}

class ForkJoinSum extends RecursiveTask<Long> {

    /**
     *
     */
    private static final long serialVersionUID = -1257568709792496086L;

    private long start;
    private long end;

    private static final long THRESHOLD = 10000L; //临界值

    public ForkJoinSum(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;

        if (length <= THRESHOLD) {
            long sum = 0L;

            for (long i = start; i <= end; i++) {
                sum += i;
            }

            return sum;
        } else {
            long middle = (start + end) / 2;
            ForkJoinSum left = new ForkJoinSum(start, middle);
            left.fork();

            ForkJoinSum right = new ForkJoinSum(middle + 1, end);
            right.fork();

            return left.join() + right.join();
        }
    }

}