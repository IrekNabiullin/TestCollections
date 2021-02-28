// задачки с подготовки к собесам

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] args) {


//        ArrayList<Test> list = new ArrayList<>();
//        list.add(new Test("alex"));
//        list.stream().
//        filter(x -> x.str.equals("alex")).forEach(System.out::println);
//        filter(x -> "alex".equals(x.str)).forEach(System.out::println);

        Test t1 = new Test("a");
        Test t2 = new Test("b");

        Map<Test, Integer> map1 = new HashMap<>();
        Map<Test, Integer> map2 = new HashMap<>();

        System.out.println((map1.put(t1, 10)));
        System.out.println((map1.put(t2, 10)));


    }

    public static class Test {
        public String str;

        public Test(String str) {
            this.str = str;
        }

        @Override
        public boolean equals(Object o) {
            if (str.equals("a")) {
                return true;
            }
            return o.equals(str);
        }

    }
}
