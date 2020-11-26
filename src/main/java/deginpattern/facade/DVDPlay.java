package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:07
 */
public class DVDPlay {

    private DVDPlay() {
    }

    private static DVDPlay instance = new DVDPlay();

    public static DVDPlay getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD ON");
    }

    public void off() {
        System.out.println("DVD OFF");
    }

    public void play() {
        System.out.println("DVD PLAY");
    }

    public void pause() {
        System.out.println("DVD PAUSE");
    }
}