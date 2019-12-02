package adapter.objectadapter;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 手机使用5V电压充电
 */
public class Phone {

    public void charGing(V5 v5){
        int i = v5.outPut5V();
        if (i == 5){
            System.out.println("电压为5V，可以充电");
        }else {
            System.out.println("无法充电");
        }
    }

}
