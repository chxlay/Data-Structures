package deginpattern.decorator;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:19:24
 */
@Data
public abstract class Drink {

    public String des;// 描述
    private float price = 0.0F; // 价格

    /**
     * 计算价格，子类来实现
     * @return
     */
    public abstract float cost();
}
