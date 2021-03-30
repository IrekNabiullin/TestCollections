import java.util.concurrent.*;

public class MyConcurrentHashMap {
    public static void main(String[] args) {

        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(100, "Hello");
        m.put(101, "Geeks");
        m.put(102, "Geeks");

        // Здесь мы не можем добавить Hello, потому что 101 ключ
        // уже присутствует в объекте ConcurrentHashMap
        m.putIfAbsent(101, "Hello");

        // Мы можем удалить запись, потому что 101 ключ
        // связан с For value
        m.remove(101, "Geeks");

        // Теперь мы можем добавить Hello
        m.putIfAbsent(103, "Hello");

        // Мы не можем заменить Hello на For
        m.replace(101, "Hello", "For");

        System.out.println(m);
    }
}
