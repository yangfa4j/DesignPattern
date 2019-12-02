package singleton;

/**
 * @Date 2019/11/15
 * @Author yangfa
 * @Description 静态常量饿汉式
 */
public class singleton1 {
}

class Singleton1{

    // 1、私有化构造函数，防止外部 new 对象
    private Singleton1(){

    }

    // 2、在类里面自己 new 一个静态对象
    public static final Singleton1 instance = new Singleton1();

    // 3、对外提供一个公开的获得实例的方法
    public static Singleton1 getInstance(){
        return instance;
    }
}
