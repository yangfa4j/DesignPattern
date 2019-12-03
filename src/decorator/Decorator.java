package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description 装饰者
 */
public abstract class Decorator extends Drink {

    private Drink drink; // 被装饰的对象

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 配料的价钱 + 饮料的价钱
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        // 配料的名字 + 配料的价钱 + 饮品的名字
        return super.getDescription() + " " + super.getPrice() + " $$ " + drink.getDescription();
    }
}
