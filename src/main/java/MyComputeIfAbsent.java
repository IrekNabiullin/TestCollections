// Java-программа для демонстрации
// computeIfAbsent (Key, Function) метод.


import java.util.*;

public class MyComputeIfAbsent {
    // Основной метод

    public static void main(String[] args) {
        // создаем HashMap и добавляем некоторые значения
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);

        // распечатать детали карты
        System.out.println("HashMap:\n "
                + map.toString());

        // предоставить значение для нового ключа, который отсутствует
        // используя метод computeIfAbsent
        map.computeIfAbsent("key5",
                k -> 2000 + 33000);

        map.computeIfAbsent("key6",
                k -> 2000 * 34);

        // распечатать новое отображение
        System.out.println("New HashMap:\n "
                + map);
    }
}
