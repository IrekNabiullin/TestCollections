import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MyBiFunction {


    public static void main(String[] args) {
        MyBiFunction.test( (a, b) -> a + b, 10, 20 );  // 30  - BiFunction на входе 2 элемента, на выходе один
        MyBiFunction.test2( (a, b) -> a * b, 10, 20 );  // 200  - один функциональный интефейс внутри другого
    }
    public static void test(
            BiFunction<Integer, Integer, Integer> f, int x, int y) {
        System.out.println(f.apply(x, y));
    }


    public static void test2(
            BiFunction<Integer, Integer, Integer> f, int x, int y) {
        MyConsumer.test( //вызов другого функционального интерфейсас внутри функционального интерфейса
                System.out::println, f.apply(x, y));

    }

}
