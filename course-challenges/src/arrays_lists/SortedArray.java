package arrays_lists;

import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(sortIntegers(array));
    }

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
