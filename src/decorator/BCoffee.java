package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description B咖啡
 */
public class BCoffee extends Coffee{

    public BCoffee() {
        super.setDescription(" B类型的咖啡 ");
        super.setPrice(20.0f);
    }
}
