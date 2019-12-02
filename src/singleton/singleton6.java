package singleton;

/**
 * @Date 6019/11/16
 * @Author yangfa
 * @Description 线程安全的懒汉式
 */
public class singleton6 {
}

class Singleton6{

    private Singleton6(){

    }

    private static volatile Singleton6 instance;

    public  static Singleton6 getInstance(){

        if (instance == null){
            synchronized (Singleton6.class){
                if (instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
