package bridge;

/**
 * @Date 2019/12/2
 * @Author yangfa
 * @Description 图形类
 */
public abstract class Shape {
     Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}