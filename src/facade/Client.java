package facade;

/**
 * @Date 2019/12/4
 * @Author yangfa
 * @Description 松耦合
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.callA();
        facade.callB();
    }
}
