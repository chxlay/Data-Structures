package deginpattern.state;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:02:25
 */
@Data
// 状态抽象类
public abstract class State {

    public Activity activity;

    public State(Activity activity) {
        this.activity = activity;
    }

    /**
     * 扣除积分
     */
    public abstract void deductMoney();

    /**
     * 是否抽中奖品
     *
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();

}
