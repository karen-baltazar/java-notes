public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators:");
        arithmeticOperators();

        System.out.println("\nUnary Operators:");
        unaryOperators();

        System.out.println("\nAssignment Operators:");
        assignmentOperators();

        System.out.println("\nRelational Operators:");
        relationalOperators();

        System.out.println("\nLogical Operators:");
        logicalOperators();

        System.out.println("\nTernary Operator:");
        ternaryOperator();

        System.out.println("\nBitwise Operators:");
        bitwiseOperators();

        System.out.println("\nShift Operators:");
        shiftOperators();

        System.out.println("\nInstance of Operator:");
        instanceOfOperator();
    }

    // Method to demonstrate arithmetic operators
    static void arithmeticOperators() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0
    }

    // Method to demonstrate unary operators
    static void unaryOperators() {
        int x = 5;
        System.out.println("Unary Plus: " + (+x)); // 5
        System.out.println("Unary Minus: " + (-x)); // -5
        System.out.println("Increment: " + (++x)); // 6
        System.out.println("Decrement: " + (--x)); // 5
    }

    // Method to demonstrate assignment operators
    static void assignmentOperators() {
        int y = 10;
        System.out.println("Basic Assignment: " + y); // 10
        System.out.println("y += 5: " + (y += 5)); // 15
        System.out.println("y -= 3: " + (y -= 3)); // 12
        System.out.println("y *= 2: " + (y *= 2)); // 24
        System.out.println("y /= 4: " + (y /= 4)); // 6
        System.out.println("y %= 5: " + (y %= 5)); // 1
    }

    // Method to demonstrate relational operators
    static void relationalOperators() {
        int a = 10, b = 5;
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not Equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b)); // false
    }

    // Method to demonstrate logical operators
    static void logicalOperators() {
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false
    }

    // Method to demonstrate ternary operator
    static void ternaryOperator() {
        int a = 5, b = 10;
        int max = (a > b) ? a : b; // Returns b
        System.out.println("Ternary Operator (max): " + max); // 10
    }

    // Method to demonstrate bitwise operators
    static void bitwiseOperators() {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        System.out.println("Bitwise AND: " + (a & b)); // 1  (0001)
        System.out.println("Bitwise OR: " + (a | b));  // 7  (0111)
        System.out.println("Bitwise XOR: " + (a ^ b)); // 6  (0110)
        System.out.println("Bitwise Complement: " + (~a)); // -6 (inverts all bits)
    }

    // Method to demonstrate shift operators
    static void shiftOperators() {
        int a = 5;  // 0000 0101 in binary

        System.out.println("Left Shift: " + (a << 1));  // 10  (0000 1010)
        System.out.println("Right Shift: " + (a >> 1)); // 2   (0000 0010)
        System.out.println("Unsigned Right Shift: " + (a >>> 1)); // 2 (same as right shift for positive numbers)
    }

    // Method to demonstrate instance of operator
    static void instanceOfOperator() {
        String str = "Hello, World!";
        System.out.println("Is str an instance of String? " + (str instanceof String)); // true
    }
}
