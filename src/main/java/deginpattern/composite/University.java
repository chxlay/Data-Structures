package deginpattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Alay
 * @Date: 2020-07-30 22:16:52
 */
@Data
// University 就是Composite 可以管理 College
public class University extends OrganizationCoponent {

    private List<OrganizationCoponent> clleges = new ArrayList<>();


    public University(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void add(OrganizationCoponent organizationCoponent) {
        clleges.add(organizationCoponent);
    }

    @Override
    public void remove(OrganizationCoponent organizationCoponent) {
        clleges.remove(organizationCoponent);
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
        for (OrganizationCoponent cllege : clleges) {
            System.out.println(cllege);
        }

    }
}
