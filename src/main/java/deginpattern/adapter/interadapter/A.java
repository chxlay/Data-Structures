package deginpattern.adapter.interadapter;

/**
 * @Author: Alay
 * @Date: 2020-07-19 22:51:45
 */
public class A extends AbsAdapter {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void operation1() {
                System.out.println("实现自己的方法");
            }
        };
        absAdapter.operation1();
    }

}
