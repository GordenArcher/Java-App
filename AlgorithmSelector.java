import java.util.Scanner;

public class AlgorithmSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Linear Search");
        System.out.println("3. Traveling Salesman (Brute Force)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                BubbleSort.runBubbleSort();
                break;
            case 2:
                LinearSearch.runLinearSearch();
                break;
            case 3:
                TravelingSalesman.runTravelingSalesman();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
