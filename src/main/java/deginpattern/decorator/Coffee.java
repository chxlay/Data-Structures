package deginpattern.decorator;

/**
 * @Author: Alay
 * @Date: 2020-07-21 22:24:06
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        float price = super.getPrice();
        return price;
    }

    @Override
    public String getDes() {
        return super.getDes() +" "+ super.getPrice();
    }
}
