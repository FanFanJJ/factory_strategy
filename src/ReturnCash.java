/**
 * 满减策略，本次使用的策略为每满300减100
 */
public class ReturnCash extends SuperCash {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public ReturnCash(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double getCash(double money) {
        double result = money;
        if(money > moneyCondition){
            result = money - (int)(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
