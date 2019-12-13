package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/12/12
 * @Author yangfa
 * @Description  管理备忘录的集合
 */
public class Caretaker {
    // 在list集合中 有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
