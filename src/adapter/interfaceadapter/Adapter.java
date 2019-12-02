package adapter.interfaceadapter;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 接口适配器
 */
public class Adapter implements V {

    // 默认实现，空实现

    @Override
    public int outPut5V() {
        return 0;
    }

    @Override
    public int outPut220V() {
        return 0;
    }

    @Override
    public int outPut380V() {
        return 0;
    }
}
