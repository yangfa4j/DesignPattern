package observer;

/**
 * @Date 2019/12/11
 * @Author yangfa
 * @Description 百度自己的天气
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println(" == Today temperature is :" + temperature);
        System.out.println(" == Today pressure is :" + pressure);
        System.out.println(" == Today humidity is :" + humidity);
    }
}
