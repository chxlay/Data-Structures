package deginpattern.decorator;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:26:16
 */
// 美式咖啡,被装饰者
public class LongBlack extends Coffee {
    public LongBlack() {
        this.setDes("美式咖啡");
        this.setPrice(5.00F);
    }
}
