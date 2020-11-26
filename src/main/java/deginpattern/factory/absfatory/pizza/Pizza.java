package deginpattern.factory.absfatory.pizza;

/**
 * @Author: Alay
 * @Date: 2020-07-19 15:12:31
 */
public abstract class Pizza {
    private String name;
    private String flavor;

    public abstract void prepare();

    public void back() {
        System.out.println(name + flavor + "披萨烘焙");
    }

    public void cut() {
        System.out.println(name + flavor + "披萨裁剪");
    }

    public void box() {
        System.out.println(name + flavor + "披萨打包");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
