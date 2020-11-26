package deginpattern.adapter.interadapter;

/**
 * @Author: Alay
 * @Date: 2020-07-19 22:56:58
 */
public class B implements Interface4 {
    public static void main(String[] args) {
        Interface4 interface4 = new Interface4() {
            @Override
            public void operation1() {
                System.out.println("JDK8,接口默认方法，只重写自己需要的方法");
            }
        };
        interface4.operation1();
    }
}
