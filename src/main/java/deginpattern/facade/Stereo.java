package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:17
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo ON");
    }

    public void off() {
        System.out.println("Stereo OFF");
    }

    public void upVolume() {
        System.out.println("Stereo upVolume");
    }

    public void downVolume() {
        System.out.println("Stereo downVolume");
    }

}