package deginpattern.flyweight;

/**
 * @Author: Alay
 * @Date: 2020-09-13 14:07
 */
public class ConcreteWebSite extends WebSite {

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
