package bridge;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 灰色
 */
public class Gray implements Color{
 
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}