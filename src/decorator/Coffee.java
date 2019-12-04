package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description 咖啡总类
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
