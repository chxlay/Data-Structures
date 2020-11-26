package deginpattern.prototype.improve;

/**
 * @Author: Alay
 * @Date: 2020-07-19 18:49:13
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private Sheep friend;

    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep =  (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    public Sheep(String name, int age, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
