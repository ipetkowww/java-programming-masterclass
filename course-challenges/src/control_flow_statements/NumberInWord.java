package control_flow_statements;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(-1);
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
    }

    public static void printNumberInWord(int number) {
        String[] numbersInWords = {"ZERO", "ONE", "TWO", "THREE",
                "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String result = number >= 0 && number <= 9 ? numbersInWords[number] : "OTHER";
        System.out.println(result);
    }
}
