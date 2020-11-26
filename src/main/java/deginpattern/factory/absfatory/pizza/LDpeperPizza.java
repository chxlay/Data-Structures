package deginpattern.factory.absfatory.pizza;


/**
 * @Author: Alay
 * @Date: 2020-07-19 15:17:55
 */
public class LDpeperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + this.getName() + "原材料");
    }

    public LDpeperPizza() {
        this.setFlavor("胡椒味");
        this.setName("伦敦");
    }
}
