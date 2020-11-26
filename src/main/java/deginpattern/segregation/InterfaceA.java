package deginpattern.segregation;

/**
 * @Author: Alay
 * @Date: 2020-07-15 22:48:48
 */
public interface InterfaceA {
    void operation1();
}

interface InterfaceB {
    void operation2();

    void operation3();
}

interface InterfaceC {
    void operation4();

    void operation5();
}

class B2 implements InterfaceA, InterfaceB {

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}


class D2 implements InterfaceA, InterfaceC {
    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class A2 {
    public void operation1(InterfaceA a) {
        a.operation1();
    }

    public void operation4(InterfaceC c) {
        c.operation4();
    }

    public void operation5(InterfaceC c) {
        c.operation5();
    }
}


class C2 {
    public void operation1(InterfaceA a) {
        a.operation1();
    }

    public void operation2(InterfaceB b) {
        b.operation2();
    }

    public void operation3(InterfaceB b) {
        b.operation3();
    }
}