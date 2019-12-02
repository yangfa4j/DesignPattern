package singleton;

/**
 * @Date 3019/11/15
 * @Author yangfa
 * @Description 线程不安全的懒汉式
 */
public class singleton3 {
}

class Singleton3{

    private Singleton3(){

    }

    private static  Singleton3 instance;

    public static Singleton3 getInstance(){

        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
