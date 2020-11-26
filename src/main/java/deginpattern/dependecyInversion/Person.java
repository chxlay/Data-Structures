package deginpattern.dependecyInversion;

/**
 * @Author: Alay
 * @Date: 2020-07-15 23:17:08
 */
public class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}


class Person2 {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

interface IReceiver {
    public String getInfo();
}

class Email2 implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

class Wechate implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息: hello,world";
    }
}
