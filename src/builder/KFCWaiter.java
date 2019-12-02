package builder;

public class KFCWaiter {
    private KFCBuilder kfcBuilder; // 维护了一个抽线 Builder,
    
    public KFCWaiter(KFCBuilder kfcBuilder) {
        this.kfcBuilder = kfcBuilder;
    }
    

    //
    public KFC construct(){

        //准备食物
        kfcBuilder.buildFood();
        //准备饮料
        kfcBuilder.buildDrink();
        
        //准备完毕，返回一个完整的套餐给客户
        return kfcBuilder.makeKFC();
    }
}