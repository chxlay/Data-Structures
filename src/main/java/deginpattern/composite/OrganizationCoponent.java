package deginpattern.composite;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-30 22:12:01
 */
@Data
public abstract class OrganizationCoponent {
    private String name;
    private String desc;

    public void add(OrganizationCoponent organizationCoponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationCoponent organizationCoponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationCoponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected abstract void print();

}