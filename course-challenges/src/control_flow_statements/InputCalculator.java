package control_flow_statements;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
        }
        if (sum != 0) {
            average = 1.0 * sum / count;
        }
        System.out.printf("SUM = %d AVG = %d%n", sum, Math.round(average));
    }
}
