package deginpattern.composite;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Alay
 * @Date: 2020-07-30 22:51:52
 */
public class Test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("曹雪芹", "红楼梦");

        Map<String, String> map1 = new HashMap<>();
        map1.put("吴承恩", "西游记");
        map1.put("罗贯中", "三国演义");
        map1.put("施耐庵", "水浒传");

        map.putAll(map1);

    }
}
