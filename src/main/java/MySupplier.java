import java.util.Random;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        MySupplier.test(
                () -> {
                    Random r = new Random();
                    return r.nextInt(101);
                });
    }
    public static void test(
            Supplier<Integer> f) {
        System.out.println(f.get());
    }
}
