package deginpattern.flyweight;

/**
 * @Author: Alay
 * @Date: 2020-09-13 14:04
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("新闻网");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteCategory("博客网");
        webSite2.use(new User("jack"));

        WebSite webSite3 = factory.getWebSiteCategory("博客网");
        webSite3.use(new User("smith"));

        WebSite webSite4 = factory.getWebSiteCategory("博客网");
        webSite4.use(new User("king"));

        // 建设的网站数量
        System.out.println(factory.getWebSiteCount());
    }
}
