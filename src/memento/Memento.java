package memento;

/**
 * @Date 2019/12/12
 * @Author yangfa
 * @Description 备忘录
 */
public class Memento {

    private String state; // 保存的状态

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
