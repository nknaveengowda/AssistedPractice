public class ImplicitExplicit {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 10;
        long longValue = intValue; // Implicit casting from int to long
        float floatValue = longValue; // Implicit casting from long to float
        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);

        // Explicit Type Casting (Narrowing)
        double doubleValue = 123.45;
        float newFloatValue = (float) doubleValue; // Explicit casting from double to float
        int newIntValue = (int) newFloatValue; // Explicit casting from float to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + doubleValue);
        System.out.println("float value (after explicit casting): " + newFloatValue);
        System.out.println("int value (after explicit casting): " + newIntValue);
    }
}