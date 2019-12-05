package flyweight;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description 网站工厂类
 */
public class WebSiteFactory {

    // 池
    private Map<String,WebSite> pool = new HashMap<>();

    // 根据类型，返回网站,没有就创建一个网站，加入到池中返回
    public WebSite getWebSite(String type){
        if ( !pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类的总数
    public int getSize(){
       return pool.size();
    }
}
