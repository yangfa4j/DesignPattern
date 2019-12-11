package observer;


/**
 * @Date 2019/12/11
 * @Author yangfa
 * @Description 被观察类需要实现的接口
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
