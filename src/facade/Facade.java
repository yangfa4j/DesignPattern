package facade;

/**
 * @Date 2019/12/4
 * @Author yangfa
 * @Description
 */
public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public Facade() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
    }

    // 对外暴露的方法
    public void callA(){
        this.subSystemA.dosomethingA();
    }

    public void callB(){
        this.subSystemB.dosomethingB();
    }
}
