import java.util.ArrayList;

public class MyStreamTest01 {
    public static void main(String[] args) {
        final var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        var result = list.stream().filter(it->{
            System.out.println(it);
            return it<3;
        }).map(it->{
            System.out.println(it*it);
            return it*it;
        });
        System.out.println(result);
    }
}
