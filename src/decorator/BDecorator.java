package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description
 */
public class BDecorator extends Decorator {

    public BDecorator(Drink drink) {
        super(drink);
        super.setDescription(" 牛奶 ");
        super.setPrice(2.5f);
    }
}
