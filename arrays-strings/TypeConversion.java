public class TypeConversion {

    public static void main(String[] args) {
        // Implicit conversion (widening)
        int intNumber = 42;
        double doubleNumber = intNumber; // int to double
        System.out.println("Implicit Conversion: " + doubleNumber);

        // Explicit conversion (narrowing)
        double anotherDouble = 9.78;
        int castedInt = (int) anotherDouble; // double to int
        System.out.println("Explicit Conversion: " + castedInt);

        // Example with char to int conversion
        char charValue = 'A';
        int charToInt = charValue; // char to int (ASCII value)
        System.out.println("Character to ASCII int: " + charToInt);
    }
}
