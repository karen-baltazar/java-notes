public class Loops {
    public static void main(String args[]) {
        // Demonstrate while loop
        System.out.println("While Loop:");
        whileDemo();

        // Demonstrate for loop
        System.out.println("For Loop:");
        forDemo();

        // Demonstrate do-while loop
        System.out.println("Do-While Loop:");
        doWhileDemo();

        // Demonstrate nested for loops
        System.out.println("Nested Loops:");
        nestedLoopDemo();
    }

    // Method to demonstrate a while loop
    static void whileDemo() {
        int i = 0;

        while (i <= 10) {
            System.out.print(i + " "); // Print numbers on the same line
            i++; // Increment i
        }
        System.out.println(); // Move to the next line after the loop
    }

    // Method to demonstrate a for loop
    static void forDemo() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " "); // Print numbers on the same line
        }
        System.out.println(); // Move to the next line after the loop
    }

    // Method to demonstrate a do-while loop
    static void doWhileDemo() {
        int i = 0;
        do {
            System.out.print(i + " "); // Print numbers on the same line
            i++; // Increment i
        } while (i <= 10);
        System.out.println(); // Move to the next line after the loop
    }

    // Method to demonstrate nested for loops
    static void nestedLoopDemo() {
        for (int i = 1; i <= 5; i++) { // Outer loop
            for (int j = 1; j <= 5; j++) { // Inner loop
                System.out.print(i * j + "\t"); // Print the product with a tab space
            }
            System.out.println(); // Move to the next line after inner loop
        }
    }
}
