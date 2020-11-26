package Queue;

/**
 * @author Alay
 * @create 2020-01-08 2:11
 */
public class CircleArrayQueue {

    //表示数组的最大容量
    private int maxSize;

    //front 变量的含义做调整：front就指向队列的第一个元素，即 arr[front]就是队列的第一个元素，front 的初始值为  0；
    private int front;//表示队列的头部

    //rear  变量的含义做调整：rear  指向队列的最后一个元素的后一个位置，因为需要遗留出一个位置空间做约定计算，rear 的初始值为 0
    private int rear;

    //用于存放数据，模拟队列
    private int[] arr;


    /**
     * 队列初始化
     *
     * @param maxSize
     */
    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }


    /**
     * 判断队列是否满
     *
     * @return
     */
    public boolean isFull() {
        //当队列满时，满足条件：(rear+1)%maxSize = front (满了)
        return (rear + 1) % maxSize == front;
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
        arr[rear] = num;
        //让rear后移一位,环形数组，若rear>maxSize了，rear又跑到前面去了，所以用取模实现，否则下角标越界
        rear = (rear + 1) % maxSize;
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
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空的");
            return;
        }
        for (int i = front; i < front + size(); i++) {
            System.out.println(arr[i % maxSize]);
        }
    }


    /**
     * 获取队列的头数据
     */

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的");
        }
        return arr[front];
    }

    /**
     * 队列中有效数据的个数是
     */
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }


}