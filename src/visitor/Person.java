package visitor;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description
 */
public abstract class Person {

    // 提供一个方法，给访问者可以访问
    public abstract void accept(Action action);

}
