package deginpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Alay
 * @Date: 2020-09-13 14:10
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
     */
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    /**
     * 获取网站分类的总数 (池中有多少个网站类型)
     */
    public int getWebSiteCount() {
        return pool.size();
    }

}