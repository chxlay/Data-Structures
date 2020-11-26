package deginpattern.builder.improve;

import lombok.NoArgsConstructor;

/**
 * @Author: Alay
 * @Date: 2020-07-19 21:19:10
 */
@NoArgsConstructor
// 指挥者 角色,指挥流程
public class HouseDirect {

    private HouseBuilder houseBuilder;

    /**
     * 方式一：可以通过构造器 进行聚合
     *
     * @param houseBuilder
     */
    public HouseDirect(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 方式二： 通过 setter 聚合
     *
     * @param houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWills();
        houseBuilder.roofed();
        House house = houseBuilder.buildHouse();
        return house;
    }
}
