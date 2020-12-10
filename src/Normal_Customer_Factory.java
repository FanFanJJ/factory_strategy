public class Normal_Customer_Factory extends CustomerFactory{
    @Override
    public void welcome_customer() {
        System.out.println("欢迎您普通顾客，继续在本店消费您会升级为vip顾客");
        System.out.println("您的本次消费情况如下:");
    }
}
