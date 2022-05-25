package arrays_lists;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        reverse(new int[] {1, 2, 3, 4, 5});
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

}
