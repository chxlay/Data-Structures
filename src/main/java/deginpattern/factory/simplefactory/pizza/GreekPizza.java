package deginpattern.factory.simplefactory.pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:17:55
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + this.getName() + "披萨原材料");
    }

    public GreekPizza(){
        this.setName("希腊");
    }
}
