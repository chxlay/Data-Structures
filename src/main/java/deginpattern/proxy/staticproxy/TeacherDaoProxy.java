package deginpattern.proxy.staticproxy;

/**
 * @Author: Alay
 * @Date: 2020-09-13 15:09
 */
// 代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao {

    /**
     * 代理的目标对象
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        target.teach();
        System.out.println("代理结束，提交");
    }
}
