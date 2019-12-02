package adapter.classadapter;

import sun.security.krb5.internal.crypto.Des;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 适配器类
 */
public class Adapter extends V220 implements V5 {

    // 把220V 电压 转换成 5V
    @Override
    public int outPut5V() {
        int src = outPut220V();
        int dst = src/44;
        System.out.println("转换后输出电压 :"+dst+"伏!");
        return dst;
    }
}
