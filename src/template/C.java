package template;

/**
 * @Date 2019/12/6
 * @Author yangfa
 * @Description
 */
public class C extends Cooking {

    @Override
    public void addCondition() {
        System.out.println("我不会被执行");
    }

    @Override
    boolean isTure() {
        return false;
    }
}
