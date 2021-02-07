import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");
        map.forEach((k, v) -> System.out.println(k + ": " + v));// вывод
//  Все пары (ключ-значение) хранятся во внутреннем интерфейсе Map.Entry, а чтобы получить их,
//  нужно вызвать метод entrySet(). Он возвращает множество (Set) пар, которые можно перебрать в цикле:
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            // get key
            Integer key = entry.getKey();
            // get value
            String value = entry.getValue();
        }

//        Или используя итератор:
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, String> entry =  itr.next();
            // get key
            Integer key = entry.getKey();
            // get value
            String value = entry.getValue();
        }
    }
}
