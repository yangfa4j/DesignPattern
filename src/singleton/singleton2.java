package singleton;

/**
 * @Date 2019/11/15
 * @Author yangfa
 * @Description 静态代码块饿汉式
 */
public class singleton2 {
}

class Singleton2{

    private Singleton2(){

    }

    public static  Singleton2 instance;

    static {
        instance = new Singleton2();
    }


    public static Singleton2 getInstance(){
        return instance;
    }
}
