package flyweight;

import java.time.Year;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class ConcreteWebSite extends WebSite {

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    // 可以多个用户共享的
    private String type = ""; // 网站的类型

    @Override
    public void use(User user) {
        System.out.println(user.getName()+" :使用网站的类型是 ="+ type);
    }
}
