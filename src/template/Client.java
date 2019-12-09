package template;

import com.sun.media.sound.SoftTuning;

/**
 * @Date 2019/12/6
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        // 回锅肉
        Cooking a = new A();
        a.make();
        System.out.println("------------------------------------");
        Cooking b = new B();
        b.make();
        System.out.println("------------------------------------");
        Cooking c = new C();
        c.make();
    }
}
