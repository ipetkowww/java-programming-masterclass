package methods;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {
        String result;
        if (minutes < 0) {
            result = "Invalid Value";
        } else {
            long year = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long day = remainingMinutes / 1440;
            result = minutes + " min = " + year + " y and " + day + " d";
        }
        System.out.println(result);
    }

}
