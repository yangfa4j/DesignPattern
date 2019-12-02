package adapter.interfaceadapter;



/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 手机使用5V电压充电
 */
public class Phone {

    public void charGing(){

        // 匿名内部类的方式调用适配器
        new Adapter(){
            @Override
            public int outPut5V() {
                System.out.println("使用5V的电压充电");
                return 5;
            }
        };
    }
}
