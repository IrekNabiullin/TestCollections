import java.util.function.BiFunction;

public class MyBiFunction {
    public static void main(String[] args) {
        MyBiFunction.test( (a, b) -> a + b, 10, 20 );  // 30
    }
    public static void test(
            BiFunction<Integer, Integer, Integer> f, int x, int y) {
        System.out.println(f.apply(x, y));
    }
}
