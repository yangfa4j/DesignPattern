package builder;

public class A extends KFCBuilder{

    @Override
    public void buildDrink() {
        kfc.setDrink("可乐");
    }

    @Override
    public void buildFood() {
        kfc.setFood("薯条");
    }

}