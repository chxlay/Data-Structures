package deginpattern.factory.simplefactory.pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:16:57
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + this.getName() + "披萨原材料");
    }

    public CheesePizza() {
        this.setName("起司");
    }
}
