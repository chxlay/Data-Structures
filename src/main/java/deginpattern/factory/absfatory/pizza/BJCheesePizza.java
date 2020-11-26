package deginpattern.factory.absfatory.pizza;


/**
 * @Author: Alay
 * @Date: 2020-07-19 15:16:57
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + this.getName() + "原材料");
    }

    public BJCheesePizza() {
        this.setFlavor("起司味");
        this.setName("北京");
    }
}
