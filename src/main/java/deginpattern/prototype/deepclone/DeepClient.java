package deginpattern.prototype.deepclone;

/**
 * @Author: Alay
 * @Date: 2020-07-19 19:47:35
 */
public class DeepClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person anBei = new Person(20, "安倍金三", new Car("BMW", "740Li"));
        Person jinSan = anBei.deepClone();
        System.out.println(anBei.hashCode());
        System.out.println(jinSan.hashCode());
        System.out.println(jinSan.getCar()==anBei.getCar());

    }
}
