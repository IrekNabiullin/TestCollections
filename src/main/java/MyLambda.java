import java.util.function.*;

public class MyLambda {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
    }


    static class A {
        public static int sx = 40;
        public static final int MY_CONST = 50;
        private int cy = 125;

        public void print() {
            int x = 10;
            final int y = 20;
            // Сохранение текущего значения
            int cy_tmp = this.cy;
            int sx_tmp = A.sx;
            // x = 1; // Так нельзя!
            // Создание лямбда-выражения
            Function<Integer, Integer> f = n -> {
                // cy_tmp  - значение this.cy на момент создания лямбды
                // this.cy - значение на момент вызова лямбды
                System.out.println(cy_tmp);  // 125
                System.out.println(this.cy); // 10
                System.out.println(sx_tmp);  // 40
                System.out.println(A.sx);    // 50
                // n = n + z;  // Нельзя! z не определена
                // x = 1;      // Нельзя! x - константа
                A.sx += 10;    // Изменение статической переменной
                this.cy += 5;  // Изменение поля
                A.test();      // Доступ к статическому методу
                this.echo();   // Доступ к обычному методу
                return n + x + y + A.sx + MY_CONST + this.cy;
            };
            int z = 2;        // К этой переменной нет доступа
            this.cy = 10;     // Изменение значения после создания лямбды
            A.sx = 50;
            System.out.println(f.apply(10)); // Вызов лямбда-выражения
        }

        public void echo() {
            System.out.println("echo()");
        }

        public static void test() {
            System.out.println("test()");
        }
    }
}
