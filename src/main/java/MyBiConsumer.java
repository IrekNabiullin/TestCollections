import java.util.function.BiConsumer;

public class MyBiConsumer {
    public static void main(String[] args) {
        MyBiConsumer.test(
                (a, b) -> System.out.println(a + b), 10, 15); // 25

    }
    public static void test(
            BiConsumer<Integer, Integer> f, int x, int y) {
        f.accept(x, y);
    }
}
