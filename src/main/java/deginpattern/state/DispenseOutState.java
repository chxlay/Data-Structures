package deginpattern.state;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:31:12
 */
@Data
// 奖品发完了的状态,整个活动结束
public class DispenseOutState extends State {

    public DispenseOutState(Activity activity) {
        super(activity);
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发完了，改日再来");
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {
    }
}
