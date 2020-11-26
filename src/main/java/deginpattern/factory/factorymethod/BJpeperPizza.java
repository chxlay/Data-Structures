package deginpattern.factory.factorymethod;

import deginpattern.factory.factorymethod.Pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:17:55
 */
public class BJpeperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + this.getName() + "原材料");
    }

    public BJpeperPizza() {
        this.setFlavor("胡椒味");
        this.setName("北京");
    }
}
