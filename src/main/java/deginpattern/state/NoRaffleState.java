package deginpattern.state;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:02:48
 */
@Data
// 不能抽奖的状态
public class NoRaffleState extends State {

    public NoRaffleState(Activity activity) {
        super(activity);
    }

    // 当前状态可以扣除积分，扣除后将状态改为可以抽奖的状态
    @Override
    public void deductMoney() {
        System.out.println("扣除积分成功 50 积分");
        activity.setState(activity.getCanRaffleState());
    }


    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        return false;
    }

    // 当前状态时不能发放奖品的
    @Override
    public void dispensePrize() {
    }
}
