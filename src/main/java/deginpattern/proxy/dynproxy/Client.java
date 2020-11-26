package deginpattern.proxy.dynproxy;

/**
 * @Author: Alay
 * @Date: 2020-09-13 16:06
 */
public class Client {

    public static void main(String[] args) {
        //
        Teacher teacher = new Teacher();
        ProxyFactory proxyFactory = new ProxyFactory(teacher);
        // 用接口接收代理对象，传入的目标对象是Teacher
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
