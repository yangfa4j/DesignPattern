package memento;

/**
 * @Date 2019/12/12
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator(); // 将保存的对象
        Caretaker caretaker = new Caretaker(); // 备忘录集合
        originator.setState("100");
        caretaker.add(originator.seveState()); // 保存当前状态
        System.out.println("originator.状态1 = " + originator.getState());
        originator.setState("80");
        caretaker.add(originator.seveState()); // 保存当前状态
        System.out.println("originator.状态2 = " + originator.getState());
        originator.setState("50");
        caretaker.add(originator.seveState()); // 保存当前状态
        System.out.println("originator.状态3 = " + originator.getState());
        originator.getStateFromMemento(caretaker.get(0)); // 恢复到100的状态
        System.out.println("originator.恢复后 = " + originator.getState());
    }
}
