import java.util.function.*;

public class MyPredicate {
    public static void main(String[] args) {
        MyPredicate.test(n -> n != 0, 10);  // true
        MyPredicate.test(n -> n != 0, 0);   // false
    }

    public static void test(
            Predicate<Integer> f, int x) {
        System.out.println(f.test(x));
    }
}
