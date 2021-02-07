import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");
        map.forEach((k, v) -> System.out.println(k + ": " + v));// вывод
//  Все пары (ключ-значение) хранятся во внутреннем интерфейсе Map.Entry, а чтобы получить их,
//  нужно вызвать метод entrySet(). Он возвращает множество (Set) пар, которые можно перебрать в цикле:
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            // get key
            Integer key = entry.getKey();
            // get value
            String value = entry.getValue();
        }

//        Или используя итератор:
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            // get key
            Integer key = entry.getKey();
            // get value
            String value = entry.getValue();
        }


        //Создание неизменяемой (immutable) пустой мапы:
        // При попытке добавления данных в такую мапу мы получим UnsupportedOperationException исключение.
        Map<Integer, String> emptyMap = Collections.emptyMap();
//        emptyMap.put(1,"tryToInsertElement");  // раскомментируй строку для получения UnsupportedOperationException


        // Как конвертировать Map в List
        // key list
        List<Integer> keyList = new ArrayList<>(map.keySet());
        // value list
        List<String> valueList = new ArrayList<>(map.values());
        // key-value list
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
        // печатаем entryList
        System.out.println(Arrays.toString(entryList.toArray()));
        // или выводим на печать так:
        entryList.forEach(System.out::println);

// ******************** сортировка мапы ************************************************

        // Поместить Map.Entry в список и отсортировать его, используя Comparator:
        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        System.out.println("Sorted list:");
        list.forEach(System.out::println);



        // Сортировка через лямбду:
 //       Collections.sort(list, Comparator.comparingInt(Map.Entry::getKey));

        //Использовать SortedMap, а точнее, ее реализацию — TreeMap, которая в конструкторе принимает Comparator.
        // Данный компаратор будет применяться к ключам мапы, поэтому ключами должны быть классы, реализующие интерфейс Comparable:
        SortedMap<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        sortedMap.put(1, "string 1");
        sortedMap.put(3, "string 3");
        sortedMap.put(2, "string 2");
        System.out.println("Sorted map:");
        sortedMap.forEach((k, v) -> System.out.println(k + ": " + v));// вывод на печать


        //      или используем лямбду
        SortedMap<Integer, String> sortedMapLambda = new TreeMap<>(Comparator.comparingInt(o -> o));
        sortedMapLambda.put(1, "string 1");
        sortedMapLambda.put(3, "string 3");
        sortedMapLambda.put(2, "string 2");

        System.out.println("Sorted map lambda:");
        sortedMapLambda.forEach((k, v) -> System.out.println(k + ": " + v));// вывод на печать

    }
}
