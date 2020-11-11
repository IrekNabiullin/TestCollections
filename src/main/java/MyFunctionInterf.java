import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyFunctionInterf {
    public static void main(String[] args) {
//        Function adder = new AddThree();
//        Long result = adder.apply(long) 4);
//        System.out.println("result = " + result);
//
//        Function adder =(value) -> value + 3;
//        Long resultLambda = adder.apply((long) 8);
//        System.out.println("resultLambda = " + resultLambda);

//        Predicate predicate =(value) -> value != null;
//
//        UnaryOperator unaryOperator =
//                (person) -> { person.name = "New Name"; return person; };
//
//        BinaryOperator binaryOperator =
//                (value1, value2) -> { value1.add(value2); return value1; };



    }

//    static class AddThree implements Function {
//
//        @Override
//        public Long apply(Long aLong) {
//            return aLong + 3;
//        }
//
//        @Override
//        public Object apply(Object o) {
//            return null;
//        }
//    }

    //  предикат
    static class CheckForNull implements Predicate {
        @Override
        public boolean test(Object o) {
            return o != null;
        }
    }
}
