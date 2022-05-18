package control_flow_statements;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        int greatestCommonDivisor = -1;
        if (firstNum >= 10 && secondNum >= 10) {
            int greaterNumber = Math.max(firstNum, secondNum);
            for (int i = 1; i <= greaterNumber; i++) {
                if (firstNum % i == 0 && secondNum % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
        }
        return greatestCommonDivisor;
    }

}
