package Queue;

/**
 * @author Alay
 * @create 2020-01-08 0:43
 */
public class ArrayQueue {

    private int maxSize;//表示数组的最大容量
    private int front;//表示队列的头部
    private int rear;//表示队列的尾部
    private int[] arr;//用于存放数据，模拟队列

    /**
     * 队列初始化
     *
     * @param maxSize
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部的前一个位置
        rear = -1;//指向队列尾，指向队列尾的具体的数据位置，就是队列的最后一个数据
    }

    /**
     * 判断队列是否满
     *
     * @return
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     *
     * @param num
     */
    public void addQueue(int num) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        rear++;//让rear后移一位
        arr[rear] = num;
    }

    /**
     * 获取队列的数据，数据出队列
     *
     * @return
     */
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法取数据");
        }
        front++;
        return arr[front];
    }

    /**
     * 显示队列中的数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空的");
            return;
        }
        for (int queue : arr) {
            System.out.println(queue);
        }
    }


    /**
     * 获取队列的头数据
     *
     * @return
     */
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的");
        }
        return arr[++front];
    }
}
