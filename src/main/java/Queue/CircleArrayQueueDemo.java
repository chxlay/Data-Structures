package Queue;

import java.util.Scanner;

/**
 * @author Alay
 * @create 2020-01-08 2:38
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        //创建环形队列
        //这列设置4，但队列最大有效数据为3个，空一个位置计算
        CircleArrayQueue queue = new CircleArrayQueue(4);
        char key = ' ';//接收用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据");
            System.out.println("g(get):取出队列的数据");
            System.out.println("h(head):查看队列头");
            System.err.println("请输入选择");
            key = scanner.next().charAt(0);//接收用户输入的一个字符
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数字：");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int result = queue.getQueue();
                        System.out.printf("取出的数据是：%d\n", result);
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int headQueue = queue.headQueue();
                        System.out.printf("队列头是：%d\n", headQueue);
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
            System.out.println("程序退出");
        }
    }
}
