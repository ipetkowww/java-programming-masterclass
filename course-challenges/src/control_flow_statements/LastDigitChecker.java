package control_flow_statements;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(12, 13, 14));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        boolean validNumbers = isValid(x) && isValid(y) && isValid(z);
        boolean sameLastDigit = false;

        if (validNumbers) {
            int firstNumLastDigit = x % 10;
            int secondNumLastDigit = y % 10;
            int thirdNumLastDigit = z % 10;

            if (firstNumLastDigit == secondNumLastDigit || secondNumLastDigit == thirdNumLastDigit ||
                    firstNumLastDigit == thirdNumLastDigit) {
                sameLastDigit = true;
            }
        }
        return sameLastDigit;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

}
