package deginpattern.state;

import lombok.Data;

import java.util.Random;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:18:59
 */
@Data
// 可以抽奖的状态了
public class CanRaffleState extends State {

    public CanRaffleState(Activity activity) {
        super(activity);
    }

    // 已经扣除了积分，不能再扣了
    @Override
    public void deductMoney() {
    }

    // 可以抽奖，抽奖后设置相应的状态
    @Override
    public boolean raffle() {
        Random random = new Random();
        int rate = random.nextInt(10);
        if (rate == 0) {
            //改变活动状态为发放奖品的装填
            System.out.println("中奖了,去领奖吧！！！");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾，没有抽中!");
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
    }
}
