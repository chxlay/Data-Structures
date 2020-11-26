package deginpattern.builder;

/**
 * @Author: Alay
 * @Date: 2020-07-19 20:50:03
 */
public abstract class AbstractHouse {

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

    public void build() {
        buildBasic();
        buildWills();
        roofed();
    }
}
