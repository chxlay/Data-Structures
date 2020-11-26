package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:10
 */
public class Popcorn {

    private Popcorn() {
    }

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("POPCORN ON");
    }
    public void off() {
        System.out.println("POPCORN OFF");
    }
    public void pop() {
        System.out.println("DVD IS POPING");
    }

}