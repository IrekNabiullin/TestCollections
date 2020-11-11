import java.util.function.Function;

public class MyFunctional2 {
    public static void main(String[] args) {
        MyFunctional2.test( n -> n * 2, 10 );
    }
    public static void test(
            Function<Integer, Integer> f, int x) {
        System.out.println(f.apply(x));
    }
}
