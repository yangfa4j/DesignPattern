package bridge;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 黑色
 */
public class Black implements Color{
 
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}