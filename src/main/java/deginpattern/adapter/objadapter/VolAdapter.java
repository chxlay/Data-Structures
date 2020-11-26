package deginpattern.adapter.objadapter;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-19 22:14:01
 */
@Data
// 适配器类
public class VolAdapter implements Vol5V {

    private Vol220V vol220V;

    @Override
    public int output5V() {
        int target = 0;
        if (null != this.vol220V) {
            int source = vol220V.outputVol();
            // 220V 电压转成 5 V
            target = source / 44;
        }
        return target;
    }
}
