package deginpattern.dependecyInversion;

/**
 * @Author: Alay
 * @Date: 2020-07-15 23:28:58
 */
/*public interface IopenAndClose {
    void open(ITV itv);
}

interface ITV {
    void play();
}

class OpenAndClose implements IopenAndClose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}*/
/*
public interface IopenAndClose {
    void open();
}

interface ITV {
    void play();
}

class OpenAndClose implements IopenAndClose {

    private ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}*/

public interface IopenAndClose {
    void open();

    void setTv(ITV itv);
}

interface ITV {
    void play();
}

class OpenAndClose implements IopenAndClose {

    private ITV itv;

    @Override
    public void setTv(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}