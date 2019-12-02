package singleton;

/**
 * @Date 4019/11/15
 * @Author yangfa
 * @Description 线程安全的懒汉式
 */
public class singleton4 {
}

class Singleton4{

    private Singleton4(){

    }

    private static  Singleton4 instance;

    public synchronized static Singleton4 getInstance(){

        if (instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
