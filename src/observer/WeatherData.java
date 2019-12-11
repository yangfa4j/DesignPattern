package observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @Date 2019/12/11
 * @Author yangfa
 * @Description 被观察的类，天气
 */
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    // 维护了观察者集合，可以做 Subject 类里面的三个操作
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }


    public float getPressure() {
        return pressure;
    }


    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)){
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
       observerList.forEach( observer -> observer.update(this.temperature, this.pressure, this.humidity));
    }
}
