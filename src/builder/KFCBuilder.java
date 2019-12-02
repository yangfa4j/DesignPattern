package builder;

public abstract class KFCBuilder {

    KFC kfc = new KFC(); // KFC 套餐
    
    public abstract void buildFood();
    
    public abstract void buildDrink();
    
    public KFC makeKFC(){
        return kfc;
    }
}