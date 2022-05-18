package control_flow_statements;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int n = Math.abs(number);
        int numberForCheck = 0;
        while (n > 0) {
            int digit = n % 10;
            numberForCheck = numberForCheck * 10 + digit;
            n /= 10;
        }
        return numberForCheck == Math.abs(number);
    }

}
