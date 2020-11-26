package deginpattern.decorator;

import lombok.Data;

/**
 * 装饰者
 *
 * @Author: Alay
 * @Date: 2020-07-21 22:30:04
 */
@Data
public class Decorator extends Drink {

    private Drink coffee;

    public Decorator(Drink coffee) {
        this.coffee = coffee;
    }

    @Override
    public float cost() {
        // 获取到调料自己的价格
        // 计算单品咖啡的价格
        float coffeePrice = coffee.cost();
        return super.getPrice() + coffeePrice;
    }

    @Override
    public String getDes() {
        return super.getDes() + "价格：" + super.getPrice() + " " + coffee.getDes();
    }
}
