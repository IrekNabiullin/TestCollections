import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");
        map.forEach((k, v) -> System.out.println(k + ": " + v));// вывод
    }
}
