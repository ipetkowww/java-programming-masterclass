package control_flow_statements;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int digitsCount = getDigitCount(number);
            String[] digitAsWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            int cnt = 0;
            while (cnt != digitsCount) {
                int digit = reversedNumber % 10;
                System.out.print(digitAsWords[digit] + " ");
                reversedNumber /= 10;
                cnt++;
            }
            System.out.println();
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

}
