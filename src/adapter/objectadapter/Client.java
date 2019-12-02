package adapter.objectadapter;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 类适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charGing(new Adapter());
    }
}
