import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<Integer>();
        arr.add(20);                        // В конец списка
        arr.add(0, 10);                     // В начало списка
        arr.add(arr.size(), 30);            // В конец списка
        System.out.println(arr.toString()); // [10, 20, 30]

        // Доступ по индексу
        System.out.println(arr.get(1));     // 20
        arr.set(1, 88);
        System.out.println(arr.toString()); // [10, 88, 30]

        // Сортировка
        arr.sort(null);
        System.out.println(arr.toString()); // [10, 30, 88]
        arr.sort(Collections.reverseOrder());
        System.out.println(arr.toString()); // [88, 30, 10]

        // Перебор элементов
        for (Integer item : arr) {
            System.out.print(item + " ");
        } // 88 30 10
        System.out.println();
        arr.forEach(elem -> System.out.print(elem + " "));
        // 88 30 10
        System.out.println();
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        } // 88 30 10
        System.out.println();
        ListIterator<Integer> it2 = arr.listIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        } // 88 30 10
        System.out.println();

        // В обратном порядке
        ListIterator<Integer> it3 = arr.listIterator(arr.size());
        while (it3.hasPrevious()) {
            System.out.print(it3.previous() + " ");
        } // 10 30 88
        System.out.println();

        // Изменение всех элементов
        int x = 0;
        for (int i = 0, j = arr.size(); i < j; i++) {
            x = arr.get(i);
            x *= 2;
            arr.set(i, x);
        }
        System.out.println(arr.toString()); // [176, 60, 20]

        // Добавление новых элементов в цикле
        for (int i = 0; i < 20; i++) {
            arr.add(i);
            System.out.println("value " + i + " added" );
        }
        System.out.println(arr.toString()); // [176, 60, 20]
    }
}

