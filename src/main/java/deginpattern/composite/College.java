package deginpattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Alay
 * @Date: 2020-07-30 22:16:07
 */
@Data
public class College extends OrganizationCoponent {
    // 院校管理的是 系
    private List<OrganizationCoponent> departments = new ArrayList<>();


    public College(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void add(OrganizationCoponent organizationCoponent) {
        departments.add(organizationCoponent);
    }

    @Override
    public void remove(OrganizationCoponent organizationCoponent) {
        departments.remove(organizationCoponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void print() {
        // 输出大学名称
        System.out.println("学校名称：" + getName());
        for (OrganizationCoponent department : departments) {
            System.out.println(department);
        }

    }
}
