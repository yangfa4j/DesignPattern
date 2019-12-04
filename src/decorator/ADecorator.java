package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description
 */
public class ADecorator extends Decorator {

    public ADecorator(Drink drink) {
        super(drink);
        super.setDescription( " 巧克力 ");
        super.setPrice(3.0f);
    }
}
