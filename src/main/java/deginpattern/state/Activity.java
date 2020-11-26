package deginpattern.state;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:07:53
 */
@Data
public class Activity {

    /**
     * state  表示活动当前的状态，是变化
     */
    State state = null;
    /**
     * 奖品数量
     */
    int count = 0;


    /**
     * 初始状态：不可以抽奖，做扣除积分操作
     */
    State noRafflleState = new NoRaffleState(this);
    /**
     * 可以抽奖，进行抽奖中状态
     */
    State canRaffleState = new CanRaffleState(this);
    /**
     * 中奖后派发奖金状态
     */
    State dispenseState = new DispenseState(this);
    /**
     * 奖品完了，活动结束装填
     */
    State dispensOutState = new DispenseOutState(this);

    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量
    public Activity(int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }


    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle() {
        // 如果当前的状态是抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }
    }

    //这里请大家注意，每领取一次奖品，count--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

}

