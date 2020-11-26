package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:07
 */
public class Client {

    public static void main(String[] args) {
        // 直接调用各个类显得很麻烦
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.ready();
        homeTheater.play();
        homeTheater.pause();
        homeTheater.end();
    }

}