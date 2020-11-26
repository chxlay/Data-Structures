package deginpattern.proxy.staticproxy;

/**
 * @Author: Alay
 * @Date: 2020-09-13 15:13
 */
public class Client {
    public static void main(String[] args) {
        // 创建被代理的对象
        Teacher teacher = new Teacher();

        // 将被代理对象交给代理
        TeacherDaoProxy poxy = new TeacherDaoProxy(teacher);
        // 代理执行代理方法
        poxy.teach();
    }
}
