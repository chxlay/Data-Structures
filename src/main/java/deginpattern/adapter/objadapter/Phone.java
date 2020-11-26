package deginpattern.adapter.objadapter;

/**
 * @Author: Alay
 * @Date: 2020-07-19 22:19:40
 */
public class Phone {

    public void charging(Vol5V vol5V) {
        int chargeVol = vol5V.output5V();
        if (chargeVol == 5) {
            System.out.println("电压是" + chargeVol + "V");
            System.out.println("开始充电");
        } else {
            System.out.println("电压不符合");
        }
    }
}