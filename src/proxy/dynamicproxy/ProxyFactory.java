package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description 代理工厂
 */
public class ProxyFactory {

    // 维护被代理对象，使用最终父类 Object
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 生成代理对象的方法
    public Object getProxyInstance(){

        // 参数说明
        // 1、loader 被代理对象使用的类加载器，获取加载器的方法是固定的
        // 2、interface 被代理对象实现的接口类型，使用泛型的方式确认类型
        // 3、h 额外的功能，执行被代理目标的方法时，会自动触发，添加的额外功能

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始");
                // 反射机制调用被代理对象的方法,返回调用结果
                Object invoke = method.invoke(target, args);
                System.out.println("动态代理结束");
                return invoke;

            }
        });




    }
}
