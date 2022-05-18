package methods;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = -1L;
        if (kilometersPerHour >= 0) {
            result = Math.round(kilometersPerHour / 1.609);
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        long kmToMiles = toMilesPerHour(kilometersPerHour);
        if (kmToMiles >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + kmToMiles + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
