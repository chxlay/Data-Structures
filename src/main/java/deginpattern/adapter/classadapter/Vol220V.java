package deginpattern.adapter.classadapter;

/**
 * @Author: Alay
 * @Date: 2020-07-19 22:10:29
 */
// 被适配的 类
public class Vol220V {

    public int outputVol() {
        int vol = 220;
        System.out.println("输出的电压是" + vol + "V");
        return vol;
    }
}
