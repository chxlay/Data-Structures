package deginpattern.builder;

/**
 * @Author: Alay
 * @Date: 2020-07-19 20:53:25
 */
public class HightHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWills() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
