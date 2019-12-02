package builder;

public class KFC{
    private String food; // 主食
    private String drink; // 饮料

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "KFC{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}