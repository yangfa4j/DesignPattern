package builder;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description
 */
public class B extends KFCBuilder {

    @Override
    public void buildFood() {
       kfc.setFood("鸡肉卷");
    }

    @Override
    public void buildDrink() {
        kfc.setDrink("果汁");
    }
}
