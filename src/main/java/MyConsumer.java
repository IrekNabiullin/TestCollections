import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        MyConsumer.test(
                (obj) -> System.out.println(obj), 10); // 10
        MyConsumer.test(
                (obj) -> System.out.println(obj), 50); // 50
        MyConsumer.test(
                System.out::println, 10); // 10   -  ссылка на метод вместо лямбда
        MyConsumer.test(
                System.out::println, 50); // 50   -  ссылка на метод вместо лямбда

    }
    public static void test(
            Consumer<Object> f, Object obj) {
        f.accept(obj);
    }
}
