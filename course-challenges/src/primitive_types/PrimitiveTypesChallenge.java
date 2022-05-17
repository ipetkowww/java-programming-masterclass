package primitive_types;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
        byte byteVariable = 127;
        short shortVariable = 3333;
        int integerVariable = 123456;
        long result = 50000L + 10L * (byteVariable + shortVariable + integerVariable);

        System.out.println(result);
    }

}
