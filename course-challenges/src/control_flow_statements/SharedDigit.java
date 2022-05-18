package control_flow_statements;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int checkNumber = secondNumber;

        if (firstNumber >= 10 && firstNumber <= 99 && secondNumber >= 10 && secondNumber <= 99) {
            while (firstNumber > 0) {
                int firstNumLastDigit = firstNumber % 10;
                while (checkNumber > 0) {
                    int secondNumLastDigit = checkNumber % 10;
                    if (firstNumLastDigit == secondNumLastDigit) {
                        return true;
                    }
                    checkNumber /= 10;
                }
                checkNumber = secondNumber;
                firstNumber /= 10;
            }
        }
        return false;
    }

}
