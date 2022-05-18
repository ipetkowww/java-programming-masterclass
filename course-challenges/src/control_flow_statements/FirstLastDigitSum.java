package control_flow_statements;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(-5));

        int i = sumFirstAndLastDigit(-5);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum;
        if (number <= 9) {
            sum = number + number;
        } else {
            int lastDigit = number % 10;
            int firstDigit = number / 10;

            while (firstDigit > 9) {
                firstDigit /= 10;
            }
            sum = firstDigit + lastDigit;
        }
        return sum;
    }

}
