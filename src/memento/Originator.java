package memento;

/**
 * @Date 2019/12/12
 * @Author yangfa
 * @Description 被保存对象
 */
public class Originator {

    private String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 保存状态的方法
    public Memento seveState(){
        return  new Memento(state);
    }

    // 备忘录恢复状态信息
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
