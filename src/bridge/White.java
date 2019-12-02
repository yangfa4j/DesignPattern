package bridge;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 白色
 */
public class White implements Color{
 
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
 
}