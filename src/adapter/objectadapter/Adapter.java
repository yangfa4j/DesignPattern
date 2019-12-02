package adapter.objectadapter;

import java.sql.SQLOutput;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 修改后的适配器类
 */
public class Adapter  implements V5 {

    private V220 v220 = new V220();

    // 把220V 电压 转换成 5V
    @Override
    public int outPut5V() {
        System.out.println("对象适配器模式");
        int src = v220.outPut220V();
        int dst = src/44;
        System.out.println("转换后输出电压 :"+dst+"伏!");
        return dst;
    }
}
