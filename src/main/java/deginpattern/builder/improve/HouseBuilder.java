package deginpattern.builder.improve;

/**
 * @Author: Alay
 * @Date: 2020-07-19 21:13:10
 */
// 抽象建造者
public abstract class HouseBuilder {
    private House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWills();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 建造好房子将房子（产品）返回
     */
    public House buildHouse() {
        return house;
    }
}
