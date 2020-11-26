package deginpattern.decorator;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:26:16
 */
// 单品咖啡，被装饰者
public class Espresso extends Coffee {

    public Espresso() {
        this.setDes("意大利咖啡");
        this.setPrice(6.00F);
    }
}
