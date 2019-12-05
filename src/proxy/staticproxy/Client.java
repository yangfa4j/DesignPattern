package proxy.staticproxy;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        TeachProxy teachProxy = new TeachProxy(new Teacher());
        teachProxy.teach();
    }
}
