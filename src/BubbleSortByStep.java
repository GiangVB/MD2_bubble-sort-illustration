import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list [j-1]) {
                    System.out.println("Swap " + list[j-1] + " with " + list[j]);
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
        System.out.print("List after sorted: ");
        for (int k = 0; k < list.length; k++) {
            System.out.print(list[k] + "\t");
        }
        System.out.println();
    }
}
