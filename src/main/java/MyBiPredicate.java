import java.util.function.*;

public class MyBiPredicate {
    public static void main(String[] args) {
        MyBiPredicate.test((a, b) -> a == b, 10, 10);  // true
        MyBiPredicate.test((a, b) -> a == b, 10, 20);  // false
    }

    public static void test(
            BiPredicate<Integer, Integer> f, int x, int y) {
        System.out.println(f.test(x, y));
    }
}
