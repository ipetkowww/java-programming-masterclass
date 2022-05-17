package operators;

public class OperatorChallenge {

    public static void main(String[] args) {
        double firstNumber = 20;
        double secondNumber = 80;
        double result = (firstNumber + secondNumber) * 100;
        double remainder = result % 40;

        boolean isRemainder = remainder == 0;
        if (isRemainder) {
            System.out.println("Got some remainder");
        }
    }

}
