import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreamTest02 {
    public static void main(String[] args) {
int sum  = IntStream.iterate (0, i -> i + 2).limit(10).sum();
        System.out.println("sum = " + sum);

        String s = Stream.of("word", "cat")
                .flatMap(w -> Stream.of(w.split("")))
                .peek(k -> k.equals("w"))
                .reduce((a,b) -> a + b)
                .get();
        System.out.println(s);
    }
}
