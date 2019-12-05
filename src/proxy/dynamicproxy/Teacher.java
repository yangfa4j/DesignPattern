package proxy.dynamicproxy;

import proxy.dynamicproxy.ITeach;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class Teacher implements ITeach {


    @Override
    public void teach() {
        System.out.println("我是语文老师，教语文");
    }
}
