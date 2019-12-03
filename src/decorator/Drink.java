package decorator;

/**
 * @Date 2019/12/3
 * @Author yangfa
 * @Description 饮品抽象类
 */
public abstract class Drink {

    private String description; // 饮品的描述
    private float price = 0.0f; // 价格

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算价格的方法
    public abstract float cost();

}
