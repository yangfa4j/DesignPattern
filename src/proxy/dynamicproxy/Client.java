package proxy.dynamicproxy;


/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        ITeach target = new Teacher(); // 被代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeach proxyInstance = (ITeach) proxyFactory.getProxyInstance();
        proxyInstance.teach();

    }
}
