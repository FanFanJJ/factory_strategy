/**
 * 简单工厂的应用
 * 范犇
 * 根据用户VIP等级决定打折策略
 */
public class Context {
    private SuperCash cash;
    private CustomerFactory customerX;
    public Context(CustomerEnum ce) {
        switch (ce){
            case Normal_Customer:
                cash = new RebateCash(1);  //普通用户不打折
                customerX=new Normal_Customer_Factory();
                break;
            case VIP_Customer:
                cash = new RebateCash(0.9);  //VIP用户八折
                customerX=new VIP_Customer_Factory();
                break;
            case Supervip_Customer:
                cash = new RebateCash(0.8);  //超级vip七折
                customerX=new Supervip_Customer_Factory();
                break;
            case Supersuper_Customer:
                cash = new ReturnCash(300,100);  //超级超级vip每满300减100
                customerX=new Supersuper_Customer_Factory();
                break;
        }
        customerX.welcome_customer();
    }
    public double getResult(double money){
        return cash.getCash(money);
    }
}