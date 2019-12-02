package singleton;

/**
 * @Date 5019/11/15
 * @Author yangfa
 * @Description 线程安全的懒汉式
 */
public class singleton5 {
}

class Singleton5{

    private Singleton5(){

    }

    private static  Singleton5 instance;

    public  static Singleton5 getInstance(){

        if (instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
