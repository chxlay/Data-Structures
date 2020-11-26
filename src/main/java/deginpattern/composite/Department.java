package deginpattern.composite;

/**
 * @Author: Alay
 * @Date: 2020-07-30 22:16:25
 */
public class Department extends OrganizationCoponent {

    public Department(String name, String desc) {
        super(name, desc);
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
        System.out.println(this.getName());

    }
}
