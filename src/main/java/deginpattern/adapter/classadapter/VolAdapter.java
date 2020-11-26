package deginpattern.adapter.classadapter;

/**
 * @Author: Alay
 * @Date: 2020-07-19 22:14:01
 */
// 适配器类
public class VolAdapter extends Vol220V implements Vol5V {
    @Override
    public int output5V() {
        int source = outputVol();
        // 220V 电压转成 5 V
        int target = source / 44;
        return target;
    }
}
