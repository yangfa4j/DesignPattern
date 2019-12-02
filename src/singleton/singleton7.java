package singleton;

/**
 * @Date 7019/11/17
 * @Author yangfa
 * @Description 线程安全的懒汉式
 */

class Singleton7{

    private Singleton7(){ }

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public  static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
