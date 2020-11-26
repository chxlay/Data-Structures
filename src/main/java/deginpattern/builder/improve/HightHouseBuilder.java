package deginpattern.builder.improve;

/**
 * @Author: Alay
 * @Date: 2020-07-19 20:53:25
 */
// 接口/抽象类的泛化 类，具体的实现者
public class HightHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基20m");
    }

    @Override
    public void buildWills() {
        System.out.println("高楼砌墙30cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
