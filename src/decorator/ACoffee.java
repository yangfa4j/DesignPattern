package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description A咖啡
 */
public class ACoffee extends Coffee{

    public ACoffee() {
        super.setDescription(" A类型的咖啡 ");
        super.setPrice(15.0f);
    }
}
