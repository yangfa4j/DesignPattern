package flyweight;

/**
 * @Date 2019/12/5
 * @Author yangfa
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite1 = webSiteFactory.getWebSite("微博");
        webSite1.use(new User("张三"));

        WebSite webSite2 = webSiteFactory.getWebSite("博客");
        webSite2.use(new User("李四"));
    }
}
