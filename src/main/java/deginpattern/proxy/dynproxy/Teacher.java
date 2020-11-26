package deginpattern.proxy.dynproxy;

/**
 * @Author: Alay
 * @Date: 2020-09-13 15:08
 */
public class Teacher implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中。。。");
    }
}
