package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description
 */
public class ADecorator extends Decorator {

    public ADecorator(Drink drink) {
        super(drink);
        setDescription( " 巧克力 ");
        setPrice(3.0f);
    }
}
