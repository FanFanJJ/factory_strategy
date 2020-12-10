/**
 * 折扣策略，输入打折率，得到相应的策略，例如
 * 输入0.9和0.8得到九折、八折
*/
public class RebateCash extends SuperCash {
    private double moneyRebate = 1d;

    public RebateCash(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double getCash(double money) {
        return money * moneyRebate;
    }
}
