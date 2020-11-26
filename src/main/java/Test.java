import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Alay
 * @Date: 2020-07-16 21:03:22
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }

        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }

        list.forEach(item -> System.out.println(item));
    }
}
