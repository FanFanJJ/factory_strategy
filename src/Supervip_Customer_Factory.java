/**
 * 生产超级vip的工厂
 */
public class Supervip_Customer_Factory extends CustomerFactory{
    public void welcome_customer() {
        System.out.println("欢迎您超级vip顾客，继续在本店消费您会升级为超级超级vip顾客");
        System.out.println("您的本次消费情况如下:");
    }
}
