package arrays_lists;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = readInteger();

        System.out.println("Enter " + number + " number/s:");
        int[] elements = readElements(number);

        int minElement = findMin(elements);
        System.out.printf("Min element in %s is %d%n", Arrays.toString(elements), minElement);
    }

    private static int findMin(int[] array) {
        int minNumber = array[0];
        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    private static int[] readElements(int arraySize) {
        int[] array = new int[arraySize];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    private static int readInteger() {
        return new Scanner(System.in).nextInt();
    }

}
