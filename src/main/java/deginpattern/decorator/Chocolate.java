package deginpattern.decorator;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:36:16
 */
@Data
// 具体的 Decorator 调味品
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        //调味品的价格
        setPrice(3.0f);
    }
}
