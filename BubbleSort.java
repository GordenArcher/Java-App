import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void runBubbleSort() {
        int[] array = {5, 3, 8, 4, 2};
        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime); // in nanoseconds
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Running Time: " + duration + " nanoseconds");
    }
}
