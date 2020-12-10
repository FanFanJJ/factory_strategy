/**
 * 商店模型，模拟结账过程
 * 检验四种等级的用户付费
 */
public class Shopping {

    private static void okClick(double price, double num, CustomerEnum ce){

        Context cashContext = new Context(ce);
        double totalPrice= cashContext.getResult(price*num);
        System.out.println("单价：" + price + ",数量：" + num + ",合计：" + totalPrice +"\n");
    }

    public static void main(String[] args) {
        okClick(1000,3, CustomerEnum.Normal_Customer);
        okClick(1000,3, CustomerEnum.VIP_Customer);
        okClick(1000,3, CustomerEnum.Supervip_Customer);
        okClick(1000,3, CustomerEnum.Supersuper_Customer);
    }
}
