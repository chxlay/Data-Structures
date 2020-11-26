package deginpattern.decorator;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:36:16
 */
@Data
// 具体的 Decorator 调味品
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        //调味品的价格
        setPrice(4.0f);
    }
}
