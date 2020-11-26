package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:16
 */
public class Screen {

    private Screen() {
    }

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up");
    }
    public void down() {
        System.out.println("Screen down");
    }

}