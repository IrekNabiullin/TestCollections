import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String args[]) {
        int[] unsorted = {32, 39, 21, 45, 23, 3};
        bubbleSort(unsorted);
        int[] test = {5, 3, 2, 1};
        bubbleSort(test);
    }

    public static void bubbleSort(int[] unsorted) {
        System.out.println("unsorted array before sorting : " + Arrays.toString(unsorted));
        int n = unsorted.length;
        int temp = 0;
        for (int i = 0; i < n; i++) { // Looping through the array length
            System.out.println("Sort Pass Number " + (i + 1) + ". ");
            for (int j = 1; j < (n - i); j++) {
                System.out.print("Comparing " + unsorted[j - 1] + " and " + unsorted[j] + ". ");
                if (unsorted[j - 1] > unsorted[j]) {
                    //swap elements
                    temp = unsorted[j - 1];
                    unsorted[j - 1] = unsorted[j];
                    unsorted[j] = temp;
                    System.out.print(unsorted[j] + " is greater than " + unsorted[j - 1]);
                    System.out.print(". Swapping.");
                    System.out.printf(" Array after %d pass %s. %n", i + 1, Arrays.toString(unsorted));
                } else {
                    System.out.print(unsorted[j-1] + " is less than " + unsorted[j] + ". No swapping.");
                    System.out.printf(" Array after %d pass %s: %n", i + 1, Arrays.toString(unsorted));
                }
            }
        }
    }
}

