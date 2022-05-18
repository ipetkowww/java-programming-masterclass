package control_flow_statements;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number) {
        int sumDivisors = 0;
        if (number >= 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumDivisors += i;
                }
            }
        }
        return sumDivisors == number && sumDivisors != 0;
    }

}
