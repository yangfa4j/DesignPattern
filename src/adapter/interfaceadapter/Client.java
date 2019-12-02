package adapter.interfaceadapter;




/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 接口适配器模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("接口适配器模式");
        Phone phone = new Phone();
        phone.charGing();

    }
}
