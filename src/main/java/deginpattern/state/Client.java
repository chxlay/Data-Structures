package deginpattern.state;

/**
 * @Author: Alay
 * @Date: 2020-07-22 20:37:36
 */
public class Client {

    public static void main(String[] args) {
        // 创建活动对象，奖品有 1 个奖品
        Activity activity = new Activity(1);

        // 我们连续抽 300 次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第 " + (i + 1) + " 次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();
            // 第二步抽奖
            activity.raffle();
        }
    }
}
