package observer;

/**
 * @Date 2019/12/11
 * @Author yangfa
 * @Description 观察者需要实现的接口
 */
public interface Observer {
    // 核心方法，修改天气的方法
    public void update(float temperature, float pressure, float humidity);
}
