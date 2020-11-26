package deginpattern.factory.factorymethod;

import deginpattern.factory.factorymethod.Pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:16:57
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + this.getName() + "原材料");
    }

    public LDCheesePizza() {
        this.setFlavor("起司味");
        this.setName("伦敦");

    }
}
