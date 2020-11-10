import java.util.ArrayList;
import java.util.Comparator;

public class MyComparable2 {
    public static void main(String[] args) {
        ArrayList<A> arr = new ArrayList<A>();
        arr.add(new A(1, 3));
        arr.add(new A(3, 1));
        arr.add(new A(2, 4));
        System.out.println("Initial unsorted array: " + arr.toString());
        // [{1;3}, {3;1}, {2;4}]
        // Сортировка по x
        arr.sort(null);
        System.out.println("Array sorted by x: " + arr.toString());
        // [{1;3}, {2;4}, {3;1}]
        // Сортировка по y
        arr.sort(new Comparator<A>() {
            @Override
            public int compare(A a, A b) {
                if (a.getY() > b.getY()) return 1;
                if (a.getY() < b.getY()) return -1;
                return 0;
            }
        });
        System.out.println("Array sorted by y: " + arr.toString());
        // [{3;1}, {1;3}, {2;4}]
        // Сортировка по x по убыванию
        arr.sort(new ReverseX());
        System.out.println("Array sorted by x (descent): " + arr.toString());
        // [{3;1}, {2;4}, {1;3}]
        // Сортировка по y по убыванию
        arr.sort((a, b) -> {
                    if (a.getY() > b.getY()) return -1;
                    if (a.getY() < b.getY()) return 1;
                    return 0;
                }
        );
        System.out.println("Array sorted by y (descent): " + arr.toString());
        // [{2;4}, {1;3}, {3;1}]
    }


    static class A implements Comparable<A> {
        private int x;
        private int y;

        public A(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(A other) {
            if (this.x > other.x) return 1;
            if (this.x < other.x) return -1;
            return 0;
        }

        @Override
        public String toString() {
            return "{" + this.x + ";" + this.y + "}";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (this.getClass() != obj.getClass())
                return false;
            A other = (A) obj;
            if (this.x != other.x) return false;
            if (this.y != other.y) return false;
            return true;
        }
    }

    static class ReverseX implements Comparator<A> {
        @Override
        public int compare(A a, A b) {
            return b.compareTo(a);
        }
    }
}
