package deginpattern.state;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:26:22
 */
@Data
// 发奖品的状态
public class DispenseState extends State {


    public DispenseState(Activity activity) {
        super(activity);
    }

    @Override
    public void deductMoney() {
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("领到一件奖品");
            activity.setState(activity.getNoRafflleState());
        } else {
            System.out.println("很遗憾，奖品发放完了");
            System.exit(0);
            // 后面将不再进行抽奖
            // activity.setState(activity.getDispensOutState());

        }
    }
}
