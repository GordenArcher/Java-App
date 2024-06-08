public class LinearSearch {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void runLinearSearch() {
        int[] array = {5, 3, 8, 4, 2};
        int key = 8;
        long startTime = System.nanoTime();
        int index = linearSearch(array, key);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime); // in nanoseconds
        System.out.println("Key " + key + " found at index: " + index);
        System.out.println("Running Time: " + duration + " nanoseconds");
    }
}
