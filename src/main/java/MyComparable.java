public class MyComparable {
    public static void main(String[] args) {
        A obj1 = new A(10);
        A obj2 = new A(10);
        A obj3 = new A(3);
        A obj4 = new A(15);
        System.out.println(obj1.compareTo(obj2)); // 0
        System.out.println(obj1.compareTo(obj3)); // 1
        System.out.println(obj1.compareTo(obj4)); // –1
        System.out.println(obj4.compareTo(obj1)); // 1
    }


static class A implements Comparable<A> {
    private int x;
    public A(int x) {
        this.x = x;
    }
    @Override
    public int compareTo(A other) {
        if (this.x > other.x) return 1;
        if (this.x < other.x) return -1;
        return 0;
    }
}
}
