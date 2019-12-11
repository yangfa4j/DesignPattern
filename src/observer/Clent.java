package observer;

/**
 * @Date 2019/12/11
 * @Author yangfa
 * @Description
 */
public class Clent {
    public static void main(String[] args) {

        // 创建被观察者
        WeatherData weatherData = new WeatherData();
        // 添加 观察者
        weatherData.registerObserver(new CurrentConditions());
        weatherData.setData(12f, 10f, 30f);
    }
}
