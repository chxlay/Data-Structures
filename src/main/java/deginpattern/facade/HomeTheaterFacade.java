package deginpattern.facade;

/**
 * @Author: Alay
 * @Date: 2020-09-13 12:29
 */
public class HomeTheaterFacade {

    private DVDPlay dvdPlay;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlay = DVDPlay.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlay.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlay.play();
    }

    public void pause() {
        dvdPlay.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlay.off();
    }
}
