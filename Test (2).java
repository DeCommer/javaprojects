import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = scanner.nextInt();

        scanner.nextLine();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        scanner.close();
    }
}
