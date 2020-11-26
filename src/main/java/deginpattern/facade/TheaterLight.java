package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:20
 */
public class TheaterLight {


    private TheaterLight() {
    }

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight ON");
    }

    public void off() {
        System.out.println("TheaterLight OFF");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }
}