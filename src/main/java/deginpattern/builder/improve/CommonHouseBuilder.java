package deginpattern.builder.improve;

/**
 * @Author: Alay
 * @Date: 2020-07-19 20:53:02
 */
// 接口/抽象类的泛化 类，具体的实现者
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5m");
    }

    @Override
    public void buildWills() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
