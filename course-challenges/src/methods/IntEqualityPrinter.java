package methods;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        String result;
        if (x < 0 || y < 0 || z < 0) {
            result = "Invalid Value";
        } else {
            if (x == y && y == z) {
                result = "All numbers are equal";
            } else {
                if (x != y && y != z && x != z) {
                    result = "All numbers are different";
                } else {
                    result = "Neither all are equal or different";
                }
            }
        }
        System.out.println(result);
    }

}
