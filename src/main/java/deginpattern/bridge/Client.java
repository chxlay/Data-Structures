package deginpattern.bridge;

/**
 * @Author: Alay
 * @Date: 2020-07-21 21:25:50
 */
public class Client {

    public static void main(String[] args) {
        Brand xiaoMi = new XiaoMi();
        Phone foldePhone = new FoldePhone();
        foldePhone.setBrand(xiaoMi);
        foldePhone.open();
        foldePhone.call();
        foldePhone.close();

        Brand huaWei = new HuaWei();
        foldePhone.setBrand(huaWei);
        foldePhone.open();
        foldePhone.call();
        foldePhone.close();
    }
}
