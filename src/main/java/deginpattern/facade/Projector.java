package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:13
 */
public class Projector {

    private Projector() {
    }

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector ON");
    }
    public void off() {
        System.out.println("Projector OFF");
    }
    public void focus() {
        System.out.println("Projector IS focusing");
    }
}