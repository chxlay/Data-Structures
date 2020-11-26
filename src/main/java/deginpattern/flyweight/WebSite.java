package deginpattern.flyweight;

/**
 * @Author: Alay
 * @Date: 2020-09-13 14:04
 */
public abstract class WebSite {

    protected String type;

    /**
     * 使用的方法
     * @param user 使用者
     */
    public abstract void use(User user);
}